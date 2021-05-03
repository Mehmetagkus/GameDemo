
public class UserManager {
	private Verification verification;

	public Verification getVerification() {
		return verification;
	}

	public void setVerification(Verification verification) {
		this.verification = verification;
	}

	public void signUp(Verification verification, User user) {
		System.out.println(user.getEmail() + " maili ile kayıt oldundu.");
		Utils.Verification(verification, user);
	}

	public void signIn(User user) {
		System.out.println("Hoş geldin " + user.getFirstName() + " " + user.getLastName());
	}

	public void signOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " hesabından çıkış yapıldı.");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " bilgileriniz güncellendi.");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " bilgileriniz silindi.");
	}
}
