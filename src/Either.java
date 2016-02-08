/**
 * Created by Niklas on 2016-02-07.
 */

/*För utmaning: färdigställ implementationen av klassen Either<A,B>.
 *  Tanken är att den
   ska fungera som typen Either i Haskell. Den ska representera 
   antingen ett objekt av typen
  A (annoterat Left) eller ett objekt av typen B (annoterat Right), 
  och ha metoderna
 isLeft() och isRight(). Den ska också ha metoden either med 
 motsvarande
 signatur (A -> R) -> (B -> R) -> R (fast uttryckt på ett sätt 
 som är möjligt i Java).
*/

public class Either <A,B>{
	Left<A> left;
	Right<B> right;
	
	public Either(Left<A> left) {
		this.left = left;
	}

	public Either (Right<B> right){
		this.right = right;
	}
    public boolean isLeft(Left<A> left){
    	return true;
    }
	// Return True if the given value is a Left-value, False otherwise.
	
    // public boolean isRight(){...}
//	Return True if the given value is a Right-value, False otherwise.
	
	
	
    // public T either((L->T)->(R->T)->T) func){...}
}
