//////////////////////////////////////////////////////////////////////////////////////////
//David Mugavero
//September 6, 2014
//hw02
//Arithmetic Java Program
//
//This program has the task of calculating the cost of items while shopping; including tax
//
public class Arithmetic{
    //main method required for every java program
    public static void main (String [] args) {
        int nSocks= 3; //number of pairs of socks
        double socksCost$=2.58; //Cost per pair of socks
        int nGlasses=6; //number of drinking glasses
        double glassCost$=2.29;
        int nEnvelopes=1; //number of boxes of envelopes
        double envelopeCost$=3.25; //Cost per envelope
        double taxPercent=0.06; //amount of tax
        double socksTax = nSocks*socksCost$*taxPercent; //stores socks tax value
        socksTax = socksTax*100; //helps keep two digits after decimal point when converted
        int tempSocks = (int) socksTax; //converts double value for sockTax to interger
        socksTax = (double) tempSocks/100; //converts it back to double and gives correct decimal positioning
        double glassesTax = nGlasses*glassCost$*taxPercent; //stores glasses tax value
        glassesTax = glassesTax*100; //helps keep two digits after decimal point when converted
        int tempGlasses = (int) glassesTax; //converts double value for glassesTax to interger
        glassesTax = (double) tempGlasses/100; //converts it back to double and gives correct decimal positioning
        double envelopeTax = nEnvelopes*envelopeCost$*taxPercent; //stores envelope tax value
        envelopeTax = envelopeTax*100; //helps keep two digits after decimal point when converted
        int tempEnvelope = (int) envelopeTax; //converts double value for envelopeTax to interger
        envelopeTax = (double) tempEnvelope/100; //converts it back to double and gives correct decimal positioning
        double totalTax = ((nSocks*socksCost$*taxPercent) + (nGlasses*glassCost$*taxPercent) + (nEnvelopes*envelopeCost$*taxPercent)); //stores total tax value
        totalTax = totalTax*100; //helps keep two digits after decmial point when converted
        int tempTax = (int) totalTax; //converts double value for totalTax to interger
        totalTax = (double) tempTax/100; //converts it back to double and gives correct decimal positioning
        double totalCost = (((nSocks*socksCost$) + (nGlasses*glassCost$) + (nEnvelopes*envelopeCost$)) * ((nSocks*socksCost$*taxPercent) + (nGlasses*glassCost$*taxPercent) + (nEnvelopes*envelopeCost$*taxPercent))); //stores total cost
        totalCost = totalCost*100; //helps keep two digits after decimal point when converted
        int tempCost = (int) totalCost; //converts double value for total cost to interger
        totalCost = (double) tempCost/100; //converts it back to double and gives correct decimal positioning
        System.out.println("Socks Bought: "+nSocks); //displays number of socks bought
        System.out.println("Cost Per Sock: $"+socksCost$); //displays cost per sock
        System.out.println("Glasses Bought: "+nGlasses); //displays number of glasses bought
        System.out.println("Cost Per Glass: $"+glassCost$); //displays cost per glass
        System.out.println("Envevlopes Bought: "+nEnvelopes); //displays number of envelopes bought
        System.out.println("Cost Per Envelope: $"+envelopeCost$); //displays cost per envelope
        System.out.println("Cost For Socks: $"+nSocks*socksCost$); //total cost for all socks
        System.out.println("Sales Tax For Socks: $"+socksTax); //amount of tax for socks
        System.out.println("Cost For Glasses: $"+nGlasses*glassCost$); //total cost for all glasses
        System.out.println("Sales Tax For Glasses: $"+glassesTax); //amount of tax for glasses
        System.out.println("Cost For Envelopes: $"+nEnvelopes*envelopeCost$); //total cost for all envelopes
        System.out.println("Sales Tax For Envelopes: $"+envelopeTax); //amount of tax for envelopes
        System.out.println("Total Purchase Cost: $"+((nSocks*socksCost$) + (nGlasses*glassCost$) + (nEnvelopes*envelopeCost$))); //cost of entire purchase without tax
        System.out.println("Total Sales Tax: $"+totalTax); //sales tax for entire purchase
        System.out.println("Total Purchase Cost: $"+totalCost); //cost for the whole purchase; tax included
    }
}