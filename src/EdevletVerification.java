
public class EdevletVerification implements Verification {

	@Override
	public void verification(User user) {
		System.out.println("İsim : " + user.getFirstName() + "\nSoyisim : " + user.getLastName() + "\nDoğum tarihi : "
				+ user.getDateOfBirth() + "\nKimlik Numarası : " + user.getIdentificationNumber()
				+ " E-devlet ile doğrulama işlemi başarıyla gerçekleşti.");

	}

}
