import java.io.*;

class LOG {
    private static LOG a = null;
    private LOG(){}
    public static LOG getInstance()
    {
        if(a==null)
        {
            a = new LOG();
        }
        return a;
    }
    public void writeLOG(int k)
    {
        if(k==0) 
        {
            try (FileWriter myWriter = new FileWriter("log.txt", true)) {
                myWriter.write(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " " + "Thoat chuong trinh" + '\n');
                myWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(k==1) 
        {
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " " + "Them san pham " + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else if(k==2)
        {
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " " + "In tat ca nhan vien" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        else if(k==3)
        {
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " " + "Chinh sua thong tin nhan vien" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }    
        else if(k==4)
        {
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " " + "Xoa nhan vien" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else if(k==5)
        {
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " " + "Tim kiem nhan vien" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else if(k==6)
        {
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " " + "Cap nhat luong nhan vien" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else if(k==7)
        {
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " " + "Xem lich su lam viec cua nhan vien" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else if(k==8)
        {
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " " + "Sap xep danh sach nhan vien" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else if(k==9)
        {
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " " + "Tim nhan vien phu hop cho du an" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else if(k==10)
        {
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " " + "Loc nhan vien theo bo phan" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else if(k==11)
        {
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write(java.time.LocalDate.now() + " " + java.time.LocalTime.now() + " " + "Training them cho nhan vien thuc tap" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
