package bean;

import java.util.ArrayList;
import java.util.List;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Details;
import com.paypal.api.payments.Item;
import com.paypal.api.payments.ItemList;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.PayerInfo;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;

public class Paiement {
	private static final String CLIENT_ID = "Aej3mBwdSMx9fuUgBadoNWA47NA0q8Hc6WhEbES33k1yOgHW0QpW26t58qEvO4ex9401mxr7kyIP-bZS";
	private static final String CLIENT_SECRET = "EGChneWFVi3whkMaaeYKlkpaQJbBidxDZm3Vm-ttFfoJQJNh2u2jyPIu9EJllRTHpDMEmm4fiJwBHSy2";
	private static final String MODE = "sandbox";
	
	public String authorizePayment(Produit p) throws PayPalRESTException {
		Payer payer = getPayerInformation();
		
		RedirectUrls redirectUrls = getRedirectURLs();
		List<Transaction> listTransaction = getTransactionInfo(p);
		Payment requestPayment = new Payment();
		requestPayment.setTransactions(listTransaction);
		requestPayment.setRedirectUrls(redirectUrls);
		requestPayment.setPayer(payer);
		requestPayment.setIntent("authorize");
		
		APIContext apicontext = new APIContext(CLIENT_ID,CLIENT_SECRET,MODE);
		Payment approvedPayment = requestPayment.create(apicontext);
		
		
		return getApprovalLink(approvedPayment);
	}
	
	private String getApprovalLink(Payment approvedPayment) {
		List<Links> links = approvedPayment.getLinks();
		String approvalLink = null;
		for(Links link : links) {
			if(link.getRel().equalsIgnoreCase("approval_url")) {
				approvalLink = link.getHref();
			}
		}
		return approvalLink;
	}
	
	private List<Transaction> getTransactionInfo(Produit p){
		Details details = new Details();
		details.setShipping(p.getShipping());
		details.setSubtotal(p.getSubtotal());
		details.setTax(p.getTax());
		
		Amount amount = new Amount();
		amount.setCurrency("DH");
		amount.setTotal(p.getTotal());
		amount.setDetails(details);
		
		Transaction transaction = new Transaction();
		transaction.setDescription(p.getNom());
		
		ItemList itemList = new ItemList();
		List<Item> items = new ArrayList<Item>();
		
		Item item = new Item();
		item.setCurrency("DH");
		item.setName(p.getNom());
		item.setPrice(p.getSubtotal());
		item.setTax(p.getTax());
		item.setQuantity("1");
		
		items.add(item);
		itemList.setItems(items);
		transaction.setItemList(itemList);
		
		List<Transaction> listTransaction = new ArrayList<Transaction>();
		listTransaction.add(transaction);
		
		return listTransaction;
		
	} 

	private RedirectUrls getRedirectURLs() {
		RedirectUrls redirectUrls = new RedirectUrls();
		redirectUrls.setCancelUrl("http://localhost:8080/S3_Project/cancel.html");
		redirectUrls.setReturnUrl("http://localhost:8080/S3_Project/review_payment");
		return redirectUrls;
	}

	private Payer getPayerInformation() {
		Payer payer = new Payer();
		payer.setPaymentMethod("paypal");
		PayerInfo payerInfo = new PayerInfo();
		payerInfo.setFirstName("jad");
	    payerInfo.setLastName("ezahraoui");
	    payerInfo.setEmail("ezahraouijad@gmail.com");
	    payer.setPayerInfo(payerInfo);	
		return payer;
	}
}
