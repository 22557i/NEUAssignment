package finalexam;

public class Driver {

	public static void main(String[] args) {
	

		System.out.println("Part1: Weight Loss Club");
		WeightLossClub.demo();
		System.out.println("");
		System.out.println("Part2: Two Thread for Alphabet");
		ThreadPrintData.demo();
		
		
		
	}

}

 /*Part1: Weight Loss Club
sort all members by name
Person [id=5, Age=16, name=Ann, WeightLbs=310, WeightLossLbs=10]
Person [id=4, Age=19, name=Bob, WeightLbs=312, WeightLossLbs=12]
Person [id=3, Age=17, name=Dan, WeightLbs=314, WeightLossLbs=14]
Person [id=6, Age=23, name=Eve, WeightLbs=313, WeightLossLbs=13]
Person [id=1, Age=25, name=Jim, WeightLbs=311, WeightLossLbs=11]
Person [id=2, Age=21, name=Sam, WeightLbs=315, WeightLossLbs=15]
---------------------------------------------

sort all members by WeightLoss
Person [id=5, Age=16, name=Ann, WeightLbs=310, WeightLossLbs=10]
Person [id=1, Age=25, name=Jim, WeightLbs=311, WeightLossLbs=11]
Person [id=4, Age=19, name=Bob, WeightLbs=312, WeightLossLbs=12]
Person [id=6, Age=23, name=Eve, WeightLbs=313, WeightLossLbs=13]
Person [id=3, Age=17, name=Dan, WeightLbs=314, WeightLossLbs=14]
Person [id=2, Age=21, name=Sam, WeightLbs=315, WeightLossLbs=15]
---------------------------------------------

Show MAGNITUDE GRAPH of Current WeightLoss:
Ascending order-------------
**********
***********
************
*************
**************
***************
descending order----------------
***************
**************
*************
************
***********
**********
Show MAGNITUDE GRAPH of WeightLoss AFTER 1 Month DIET ALONE:
Ascending order-------------
********************
*********************
**********************
***********************
************************
*************************
descending order----------------
*************************
************************
***********************
**********************
*********************
********************
Show MAGNITUDE GRAPH of WeightLoss AFTER DIET AND EXERCISE:
Ascending order-------------
****************************************************************************************************
**************************************************************************************************************
************************************************************************************************************************
**********************************************************************************************************************************
********************************************************************************************************************************************
******************************************************************************************************************************************************
descending order----------------
******************************************************************************************************************************************************
********************************************************************************************************************************************
**********************************************************************************************************************************
************************************************************************************************************************
**************************************************************************************************************
****************************************************************************************************

Part2: Two Thread for Alphabet
aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ
*/