public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if( !(tonerAmount > 0) && !(tonerAmount <= 100)) {
            return -1;
        } else {
            if (tonerLevel + tonerAmount > 100) {
                return -1;
            }

            return tonerLevel += tonerAmount;
        }
        
    }

    public int printPages(int pages) {
        int pagesToPrint = duplex ? Math.round((float) pages / 2) : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}