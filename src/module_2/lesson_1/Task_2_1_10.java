package module_2.lesson_1;

public class Task_2_1_10 {
}

class Solution_2_1_10 {
    static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object obj) {
            if (this==obj) {
                return true;
            }
            if (obj==null || obj.getClass() != this.getClass()) {
                return false;
            }
            ComplexNumber other = (ComplexNumber) obj;
            if (this.re != other.re || this.im != other.im) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 7 ;
            result = 37 * result + (int)(Double.doubleToLongBits(re) - (Double.doubleToLongBits(re) >>> 32)) ;
            result = 37 * result + (int)(Double.doubleToLongBits(im) - (Double.doubleToLongBits(im) >>> 32)) ;
            return result;
        }
    }
}
