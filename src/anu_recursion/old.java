//
//        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
//        df.setRowCount(0);
//        DefaultTableModel df2 = (DefaultTableModel) jTable2.getModel();
//        df2.setRowCount(0);
//        DefaultTableModel df3 = (DefaultTableModel) jTable3.getModel();
//        df3.setRowCount(0);
//
//        String all = jTextArea1.getText().replaceAll("  ", " ");
//        all = jTextArea1.getText().replaceAll("     ", " ");
//        all = jTextArea1.getText().replaceAll("    ", " ");
//        all = jTextArea1.getText().replaceAll("   ", " ");
//        String s[] = all.split("\\n");
//
//        String mthd_scope = "";
//        String methodname = "";
//
//        for (int i = 0; i < s.length; i++) {
//        String mthd_all = "";
//
//            String row = s[i];
//            String row1 = s[i];
//            for (int j = 0; j < 20; j++) {
//                row = row.replace(" (", "(");
//            }
//
//            int pblc = row.split("public").length - 1;
//            int pvt = row.split("private").length - 1;
//            int prtd = row.split("protected").length - 1;
//            int clas = row.split("class").length - 1;
//            String pblc_ar[] = row.split("public");
//            String pvt_ar[] = row.split("private");
//            String prtd_ar[] = row.split("protected");
//            String clas_ar[] = row.split("class");
//
//            if ((pblc > 0) || (pvt > 0) || (prtd > 0) && clas < 1) {
//
//                mthd_scope = "";
//
//                String metd[] = "".split("");
//                if ((pblc > 0)) {
//                    metd = pblc_ar[1].split("");
//                } else if ((pvt > 0)) {
//                    metd = pvt_ar[1].split("");
//                } else if ((prtd > 0)) {
//                    metd = prtd_ar[1].split("");
//                }
//
//                 methodname = "";
//                int x = 0;
//                int y = 0;
//
//                if (row.split("public static void main").length > 1) {
//
//                    methodname="Main Method";
//                    Vector v = new Vector();
//                    v.add("Main Method");
//                    v.add(mthd_all);
//                    df2.addRow(v);
//                    mthd_all = "";
//                } else {
//
//                    for (int j = metd.length - 1; j >= 0; j--) {
//
//                        if (metd[j].equals("(")) {
//                            x = 1;
//                        }
//                        if (metd[j].equals(" ") && x == 1) {
//                            break;
//                        }
//
//                        methodname = metd[j] + methodname;
//                    }
//
//                    Vector v = new Vector();
//                    v.add(methodname.replaceAll("[{]", ""));
//                    v.add(mthd_all);
//                    df2.addRow(v);
//                    mthd_all = "";
//                }
//                
//                mthd_all=methodname.replaceAll("[{]", "");
//
//            }
//            mthd_scope = row1.replaceAll("\\n", "");
//            
//            
//            mthd_all = mthd_all + row1.replaceAll("\\n", "");
//            Vector v = new Vector();
//            v.add(i + 1);
//            v.add(methodname.replaceAll("[{]", ""));
//            v.add(row);
//            v.add("-");
//            df.addRow(v);
//            
//            Vector v3 = new Vector();
//            v3.add(methodname.replaceAll("[{]", ""));
//            v3.add(mthd_scope);
//            df3.addRow(v3);
//
//        }

//class FibonacciMain {
//
//    public static long fibonacc(long number) {
//
//        if ((number == 0) || (number == 1)) {
//            return number;
//        } else {
//            return fibonacc(number - 1) + fibonacc(number - 2);
//        }
//    }
//
//    public static void main(String args[]) {
//        for (int count = 0; count <= 10; count++) {
//            System.out.println("Fibonacci of" + count + "is" + fibonacc(count));
//        }
//    }
//
//    private animal(int age) {
//        if ((age == 0) || (age == 1)) {
//
//            return;
//        } else {
//            return animal(age - 1);
//
//        }
//
//    }
//}
