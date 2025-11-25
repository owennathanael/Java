    package Q1;

    public class Main {
        public static void main()
        {
            LibraryItem[] items = new LibraryItem[2];
            items[0]=new Book("Robert Rath","The Infinite and The Divine",368,"book","C3422");
            items[1]=new CD("sabaton","Legends",11,"CD","C4993");
            for (LibraryItem item : items)
            {
                    LoanItem loanItem = (LoanItem) item;
                    System.out.println("Price of " + item.getType() + " (" + item.getID() + "): $" + loanItem.calculatePrice());
            }
        }
        }

