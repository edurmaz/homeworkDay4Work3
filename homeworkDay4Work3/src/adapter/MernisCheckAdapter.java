
package adapter;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckAdapter implements CustomerCheckService {

	@Override
	public boolean check(Customer customer) throws Exception {
		KPSPublicSoapProxy nglkpsPublicSoap = new KPSPublicSoapProxy();
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getYearOfBirth());
	}
}