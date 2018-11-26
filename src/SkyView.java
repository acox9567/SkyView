//Alexander Cox
//Monday, November 26, 2018

public class SkyView {

    private double [][] view;

    public SkyView (int numRows, int numCols, double[] scanned)
    {
        int k = 0;
        view = new double[numRows][numCols];

        for (int i = 0; i < numRows; i++)
        {
            if (i % 2 == 0)
            {
                for (int j = 0; j < numCols; j++)
                {
                    view[i][j] = scanned[k];
                    k++;
                }
            }
            else
            {
                for (int j = numCols - 1; j >= 0; j--)
                {
                    view[i][j] = scanned[k];
                    k++;
                }
            }
        }
    }

    public double getAverage (int startCol, int endCol, int startRow, int endRow)
    {
        double sum = 0;
        int area = ((endCol - startCol + 1) * (endRow - startRow + 1));

        for (int i = startRow; i <= endRow; i++)
        {
            for (int j = startCol; j <= endCol; j++) {
                sum += view[j][i];
            }
        }

        return sum/area;
    }

    public String toString()
    {
        String str = "";

        for (int i = 0; i < view.length; i++)
        {
            for (int j = 0; j < view[i].length; j++)
                str += String.valueOf(view[i][j]) + " ";
            str += "\n";
        }

        return str;
    }
}
