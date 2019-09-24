package sourceCode.designPattern.builder;

public class Email 
{
	private final String title;
	private final String recipients;
	private final String message;

	public Email(String title, String recipients, String message) {
		this.title = title;
		this.recipients = recipients;
		this.message = message;
	}

	public String getTitle() {
		return title;
	}

	public String getRecipients() {
		return recipients;
	}

	public String getMessage() {
		return message;
	}

	public void send() {
	}

}
