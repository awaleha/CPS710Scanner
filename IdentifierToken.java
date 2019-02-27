/**
 * Describes IDENTIFER tokens
 */

public class IdentifierToken extends Token {

  /**
   * The integer value of the token is also stored for INTEGER tokens
   */
  public String value;
  
   /* toString() generates string directly from value instead of image
   * to get rid of leading zeroes.
   */
  public String toString()
  {
  	return value.toString();
  }

  public Object getValue()
  {
	return value;
  }
 
  public IdentifierToken(String image)
  {
    this.kind = HLConstants.IDENTIFIER  ;
    this.image = image;
   	value = image;
  }

}
