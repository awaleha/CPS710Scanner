import java.math.*;

/**
 * Describes INTEGER tokens
 */

public class IntegerToken extends Token {

  /**
   * The integer value of the token is also stored for INTEGER tokens
   */
  public BigInteger value;
  
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
 
  public IntegerToken(String image)
  {
    this.kind = HLConstants.INTEGER  ;
    this.image = image;
   	value = new BigInteger(this.image);
  }

}
