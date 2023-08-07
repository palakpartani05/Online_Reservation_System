import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NewReservation 
{
    int id = 1234;
    int password = 7890;
   // int pass = Integer.parseInt(password);
    JFrame f1,f2,f3,f4,f5,f6,f7,f8;
    JButton login;
    JButton ticketBook = new JButton("Ticket Reservation");
    JButton ticketCancellation = new JButton("Ticket Cancellation");
    JButton indore = new JButton("Indore to Delhi");
    JButton chennai = new JButton("Chennai to Bhopal");
    JButton pune = new JButton("Pune to Indore");
    JButton banglore = new JButton("Banglore to Ahemdabad");

    // indore trains
    JButton b1 = new JButton("Train Name       Train No      Time");
    JButton b2 = new JButton("Shanti Exp              201035          11:05 - 23:00 ");
    JButton b3 = new JButton("Rajdhani Exps         521346          11:30 - 22:30");
    JButton b4 = new JButton("Panchwalley           321054          10:00 - 21:05");
    JButton b5 = new JButton("VeerBhumi             564785          12:40 - 23:45");

    //chennai trains
    JButton b6 = new JButton("Train Name      Train No        Time");
    JButton b7 = new JButton("VeerBhumi             201035          11:05 - 23:00 ");
    JButton b8 = new JButton("Rajya Exp             521346          21:00 - 12:20");
    JButton b9 = new JButton("Sampark kranti        321054          10:00 - 21:05");
    JButton b10 = new JButton("Chennai Exp          564785          11:30 - 23:30");

    //banglore trains
    JButton b11 = new JButton("Train Name      Train No        Time");
    JButton b12 = new JButton("Vivek Exp            19567           11:05 AM - 04:05 PM ");
    JButton b13 = new JButton("BARMER Exp           14805           10:30 AM - 07:00 PM");
    JButton b14 = new JButton("Jodhpur Exp          16508           09:50 PM - 06:55 AM");
    JButton b15 = new JButton("Ajmer Exp            16210           09:50 PM - 06:55 AM");

    //pune trains
    JButton b16 = new JButton("Train Name      Train No        Time");
    JButton b17 = new JButton("Daund Indore Exp     22943           03:30 PM - 8:30 AM ");
    JButton b18 = new JButton("LPI INDB Exp         19315           07:55 AM - 01:35 AM");
    JButton b19 = new JButton("Pune Indore Exp      19311           05:30 PM - 11:25 AM");
    JButton b20 = new JButton("Pune Nanded Exp      17513           09:35 PM - 10:20 AM");

    JButton ok = new JButton("Ok");
    JButton confirmTicket = new JButton("Confirm Ticket");
    JButton quit = new JButton("Quit");
    JLabel l0,l1,l2,demo,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JPasswordField p1;
    int passangers;
    NewReservation()
    {
        f1 = new JFrame("Reservation System");
        f1.setSize(800,600);
        //f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f1.setVisible(true);
        f1.getContentPane().setBackground(new Color(0, 255, 128));
        f1.setLayout(null);

        l0 = new JLabel("Online Reservation System");
        l0.setBounds(100,50,600,40);
        l0.setFont(new Font("Mv Boli",Font.BOLD,40));
        l0.setHorizontalAlignment(JLabel.CENTER);
        f1.add(l0);
        l1 = new JLabel("User Id");
        l1.setBounds(200, 200, 200, 30);
        l1.setFont(new Font("SERIF", Font.BOLD, 22));
        l1.setForeground(Color.BLACK);
        f1.add(l1);
        l2 = new JLabel("Password");
        l2.setBounds(200, 270, 200, 30);
        l2.setFont(new Font("SERIF", Font.BOLD, 22));
        l2.setForeground(Color.BLACK);
        f1.add(l2);

        t1 = new JTextField();
        t1.setBounds(320, 200, 220, 30);
        t1.setFont(new Font("SERIF", Font.PLAIN, 20));
        f1.add(t1);

        p1 = new JPasswordField();
        p1.setBounds(320, 270, 220,30);
        p1.setFont(new Font("SERIF", Font.PLAIN, 20));
        f1.add(p1);
   
        login = new JButton("Login");
        login.setBounds(250, 350, 200, 40);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("ARIAL", Font.BOLD, 20));
        f1.add(login);
        
        
        
    }
}
class feature extends NewReservation{
    void features(){
        //action performed on login button
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String enteredPassword = new String(p1.getPassword());
                int pass = Integer.parseInt(enteredPassword);
                
                if(Integer.parseInt(t1.getText())==id && pass==password){
                    f2 = new JFrame("Features");
                    f2.setSize(800,600);
                    f2.getContentPane().setBackground(new Color(0, 255, 128));
                    f2.setVisible(true);

                    ImageIcon icon = new ImageIcon("feature.jpg");
                    f2.setIconImage(icon.getImage());


                    l3 = new JLabel("Welcome to online reservation system");
                    l3.setHorizontalAlignment(JLabel.CENTER);
                    l3.setBounds(10,10,700,40);
                    l3.setFont(new Font("Mv Boli",Font.BOLD,35));
                    f2.add(l3);
                   
                    ticketBook.setFont(new Font("SERIF", Font.BOLD, 35));
                    ticketBook.setBackground(Color.BLACK);
                    ticketBook.setForeground(Color.WHITE);
                    f2.add(ticketBook);
                    //action performed on ticketBook butoon
                    ticketBook.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        f3 = new JFrame("Destination");
                        f3.setSize(800,600);
                        f3.getContentPane().setBackground(new Color(0, 255, 128));
                        f3.setVisible(true);

                        //label
                        l4 = new JLabel("Select Destination");
                        l4.setHorizontalAlignment(JLabel.CENTER);
                        l4.setFont(new Font("Mv Boli",Font.BOLD,40));
                        f3.add(l4);

                        //city buttons
                        indore.setFont(new Font("SERIF", Font.PLAIN, 20));
                        chennai.setFont(new Font("SERIF", Font.PLAIN, 20));
                        pune.setFont(new Font("SERIF", Font.PLAIN, 20));                       
                        banglore.setFont(new Font("SERIF", Font.PLAIN, 20));
                       
                        //add button to the frame
                        f3.add(indore);f3.add(chennai);f3.add(pune);f3.add(banglore);
                        f3.setLayout(new GridLayout(5,1,10,5));
                        f3.setVisible(true);

                    }
                    });

                    
                    ticketCancellation.setFont(new Font("SERIF", Font.BOLD, 35));
                    ticketCancellation.setBackground(Color.BLACK);
                    ticketCancellation.setForeground(Color.WHITE);
                    f2.add(ticketCancellation);

                    f2.setLayout(new GridLayout(3,1,20,20));
                    f1.setVisible(false);
                }
                else if(Integer.parseInt(t1.getText())!=id && pass!=password){
                    login.setText("Wrong id/Password");
                    login.setBackground(Color.red);
                    timer1();
                    t1.setText("");
                    p1.setText("");
                }
                else if(Integer.parseInt(t1.getText())==id && pass!=password){
                    login.setText("Wrong Password");
                    login.setBackground(Color.red);
                    timer1();
                    p1.setText("");
                }
                else{
                    login.setText("Wrong id");
                    login.setBackground(Color.red);
                    timer1();
                    t1.setText("");                
                }
            }
        });
    }
    void timer1(){
        int delayInMilliseconds = 2000; // 2 seconds
        Timer timer = new Timer(delayInMilliseconds, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.setText("Login");
                login.setBackground(Color.black);
            }
        });
        timer.setRepeats(false); // Set to false to execute the action only once
        timer.start();
    }
    
}
class Train extends feature{
    void trains()
    {
        chennai.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            f4 = new JFrame("Chennai");
            f4.setSize(800,600);
            f4.setVisible(true);
            f3.setVisible(false);
            f4.getContentPane().setBackground(new Color(0, 255, 128));
            l5 = new JLabel("Trains from Chennai to Bhopal");
            l5.setFont(new Font("Mv boli",Font.BOLD,40));
            l5.setForeground(Color.blue);
            l5.setHorizontalAlignment(JLabel.CENTER);
            b6.setFont(new Font("Mv Boli",Font.BOLD,20));
            b7.setFont(new Font("Arial",Font.PLAIN,20));        
            b8.setFont(new Font("Arial",Font.PLAIN,20));
            b9.setFont(new Font("Arial",Font.PLAIN,20));
            b10.setFont(new Font("Arial",Font.PLAIN,20));
            f4.add(l5); f4.add(b6);f4.add(b7);f4.add(b8); f4.add(b9);f4.add(b10);
            f4.setLayout(new GridLayout(6,1,10,10));
            f3.setVisible(false);

        }
        });
        indore.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            f4 = new JFrame("Indore");
            f4.setSize(800,600);
            f4.setVisible(true);
            f4.getContentPane().setBackground(new Color(0, 255, 128));
            l5 = new JLabel("Trains from Indore to Delhi");
            l5.setFont(new Font("Mv boli",Font.BOLD,40));
            l5.setForeground(Color.blue);
            l5.setHorizontalAlignment(JLabel.CENTER);
            b1.setFont(new Font("Mv Boli",Font.BOLD,25));
            b2.setFont(new Font("Arial",Font.PLAIN,20));          
            b4.setFont(new Font("Arial",Font.PLAIN,20));
            b5.setFont(new Font("Arial",Font.PLAIN,20));
            b3.setFont(new Font("Arial",Font.PLAIN,20));
            f4.add(l5); f4.add(b1);f4.add(b2);f4.add(b3); f4.add(b4);f4.add(b5);
            f4.setLayout(new GridLayout(6,1,10,10));
            f3.setVisible(false);
        }
        });
        pune.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            f4 = new JFrame("Pune");
            f4.setSize(800,600);
            f4.setVisible(true);
            f4.getContentPane().setBackground(new Color(0, 255, 128));
            l5 = new JLabel("Trains from Pune to Indore");
            l5.setFont(new Font("Mv boli",Font.BOLD,40));
            l5.setForeground(Color.blue);
            l5.setHorizontalAlignment(JLabel.CENTER);
            b16.setFont(new Font("Mv Boli",Font.BOLD,25));
            b17.setFont(new Font("Arial",Font.PLAIN,20));          
            b18.setFont(new Font("Arial",Font.PLAIN,20));
            b19.setFont(new Font("Arial",Font.PLAIN,20));
            b20.setFont(new Font("Arial",Font.PLAIN,20));
            f4.add(l5);f4.add(b16); f4.add(b17);f4.add(b18);f4.add(b19);f4.add(b20);
            f4.setLayout(new GridLayout(6,1,10,10));
            f3.setVisible(false);

        }
        });                      
        banglore.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            f4 = new JFrame("Banglore");
            f4.setSize(800,600);
            f4.setVisible(true);
            f4.getContentPane().setBackground(new Color(0, 255, 128));
            l5 = new JLabel("Trains from Banglore to Ahemdabad");
            l5.setFont(new Font("Mv boli",Font.BOLD,40));
            l5.setForeground(Color.blue);
            l5.setHorizontalAlignment(JLabel.CENTER);
            b11.setFont(new Font("Mv Boli",Font.BOLD,20));
            b12.setFont(new Font("Arial",Font.PLAIN,20));          
            b13.setFont(new Font("Arial",Font.PLAIN,20));
            b14.setFont(new Font("Arial",Font.PLAIN,20));
            b15.setFont(new Font("Arial",Font.PLAIN,20));
            f4.add(l5); f4.add(b11);f4.add(b12);f4.add(b13);f4.add(b14);f4.add(b15);
            f4.setLayout(new GridLayout(6,1,10,10));
            f3.setVisible(false);

        }
        });
    }
}
class Tickets extends Train
{
    void bookTickets()
    {
        f5 = new JFrame("Book Tickets :");
        f5.setSize(600,400);
        f5.setVisible(true);
        f5.getContentPane().setBackground(new Color(0, 0, 0));

        ImageIcon icon1 = new ImageIcon("ticket.png");
        f5.setIconImage(icon1.getImage());
        //label
        l6 = new JLabel("How Many Ticket You want to book");
        l6.setFont(new Font("Arial",Font.BOLD,25));
        l6.setHorizontalAlignment(JLabel.CENTER);
        l6.setForeground(Color.white);    
        //textfield    
        t2 = new JTextField();
        t2.setFont(new Font("Arial",Font.BOLD,40));
        t2.setBackground(new Color(0, 255, 128));
        t2.setHorizontalAlignment(JLabel.CENTER);
        //ok button
        ok.setFont(new Font("Arial",Font.BOLD,20));
        ok.setBackground(Color.BLACK);
        ok.setForeground(Color.white);
        //add into frame
        f5.add(l6,BorderLayout.NORTH);f5.add(t2,BorderLayout.CENTER);f5.add(ok,BorderLayout.SOUTH);
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                f6 = new JFrame("Passangers");
                f6.setSize(600,400);
                f6.setVisible(true);
                f6.getContentPane().setBackground(new Color(0, 255, 128));
                f6.setLayout(null);

                ImageIcon icon1 = new ImageIcon("passanger.png");
                f6.setIconImage(icon1.getImage());
                passangers = Integer.parseInt(t2.getText());
                if(passangers==1){
                    l7 = new JLabel("Person ");
                    l7.setBounds(100,100,200, 30);
                    l7.setFont(new Font("Arial",Font.BOLD,19));
                    f6.add(l7);
                    t3 = new JTextField();
                    t3.setBounds(210,100,220, 30);
                    t3.setFont(new Font("Arial",Font.PLAIN,20));
                    f6.add(t3);

                    l8 = new JLabel("Aadhar No.");
                    l8.setBounds(100,150,200, 30);
                    l8.setFont(new Font("Arial",Font.BOLD,19));
                    f6.add(l8);
                    t4 = new JTextField();
                    t4.setBounds(210,150,220, 30);
                    t4.setFont(new Font("Arial",Font.PLAIN,20));
                    f6.add(t4);

                    confirmTicket.setBounds(150,250,200,40);
                    confirmTicket.setBackground(Color.BLACK);
                    confirmTicket.setForeground(Color.WHITE);
                    confirmTicket.setFont(new Font("Arial",Font.BOLD,20));
                    f6.add(confirmTicket);
                    f5.setVisible(false);
                }
                else if(passangers==2){
                    l7 = new JLabel("Person 1");
                    l7.setBounds(100,70,200, 30);
                    l7.setFont(new Font("Arial",Font.BOLD,19));
                    t3 = new JTextField();
                    t3.setBounds(210,70,220, 30);
                    t3.setFont(new Font("Arial",Font.PLAIN,20));
                    
                    l8 = new JLabel("Aadhar No.");
                    l8.setBounds(100,120,200, 30);
                    l8.setFont(new Font("Arial",Font.BOLD,19));
                    t4 = new JTextField();
                    t4.setBounds(210,120,220, 30);
                    t4.setFont(new Font("Arial",Font.PLAIN,20));
                    
                    l9 = new JLabel("Person 2");
                    l9.setBounds(100,170,200, 30);
                    l9.setFont(new Font("Arial",Font.BOLD,19));
                    t5 = new JTextField();
                    t5.setBounds(210,170,220, 30);
                    t5.setFont(new Font("Arial",Font.PLAIN,20));

                    l10 = new JLabel("Aadhar No.");
                    l10.setBounds(100,220,200, 30);
                    l10.setFont(new Font("Arial",Font.BOLD,19));
                    t6 = new JTextField();
                    t6.setBounds(210,220,220, 30);
                    t6.setFont(new Font("Arial",Font.PLAIN,20));

                    confirmTicket.setBounds(150,280,200,40);
                    confirmTicket.setBackground(Color.BLACK);
                    confirmTicket.setForeground(Color.WHITE);
                    confirmTicket.setFont(new Font("Arial",Font.BOLD,20));
                    f6.add(l7);f6.add(l8);f6.add(l9);f6.add(l10);f6.add(t3);f6.add(t4);f6.add(t5);f6.add(t6);f6.add(confirmTicket);
                    f5.setVisible(false);
                }
                else{
                    ok.setText("You can book two tickets at a time");
                    ok.setBackground(Color.red);
                    timer1();
                    f6.setVisible((false));
                }
            }
        });
        
        f4.setVisible(false);
    }
    void timer1(){
        int delayInMilliseconds = 2000; // 2 seconds
        Timer timer = new Timer(delayInMilliseconds, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ok.setBackground(Color.black);
                ok.setText("OK");
            }
        });
        timer.setRepeats(false); // Set to false to execute the action only once
        timer.start();
    }
}
class Confirm extends Tickets{
    void booked(){
        confirmTicket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                    f7 = new JFrame("Booked");
                    f7.setSize(600, 400);
                    f7.setVisible(true);
                    f7.getContentPane().setBackground(new Color(0, 255, 128));
                    f7.setLayout(new GridLayout(6,1));

                    ImageIcon icon1 = new ImageIcon("Book.png");
                    f7.setIconImage(icon1.getImage());

                    l11 = new JLabel("Your ticket has successfully booked");
                    l11.setFont(new Font("Mv Boli",Font.BOLD,30));
                    l11.setForeground(Color.blue);
                    l11.setHorizontalAlignment(JLabel.CENTER);

                    l12 = new JLabel("Name          Aadhar No");
                    l12.setFont(new Font("Arial",Font.BOLD,25));
                    l12.setHorizontalAlignment(JLabel.CENTER);
                    f7.add(l11);f7.add(l12);

                    if(passangers==1){
                        l13 = new JLabel();
                        l13.setFont(new Font("Arial",Font.PLAIN,26));
                        l13.setHorizontalAlignment(JLabel.CENTER);
                        l13.setText(t3.getText() +"          "+ t4.getText());
                        f7.add(l13);
                    }
                    else{
                        l13 = new JLabel();
                        l13.setFont(new Font("Arial",Font.PLAIN,26));
                        l13.setHorizontalAlignment(JLabel.CENTER);
                        l13.setText(t3.getText() +"          "+ t4.getText());

                        l14 = new JLabel();
                        l14.setFont(new Font("Arial",Font.PLAIN,26));
                        l14.setHorizontalAlignment(JLabel.CENTER);
                        l14.setText(t5.getText() +"          "+ t6.getText());

                        f7.add(l13);f7.add(l14);
                    }
                    l14 = new JLabel("Thank You for using this application");
                    l14.setFont(new Font("Mv Boli",Font.BOLD,30));
                    l14.setHorizontalAlignment(JLabel.CENTER);
                    l14.setForeground(Color.red);

                    quit.setBackground(Color.BLACK);
                    quit.setForeground(Color.WHITE);
                    quit.setFont(new Font("Arial",Font.BOLD,30));
                    
                    f7.add(l14);
                    f7.add(quit);
                    f6.setVisible(false);
                }
            });
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                f7.setVisible(false);
                f6.setVisible(false);
                f3.setVisible(false);
                f2.setVisible(false);
            }
        });
    }
}
class TicketBook extends Confirm{
    void book(){
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
        b20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                bookTickets();
            }
        });
    }
}
class Cancellation extends  TicketBook{
    void cancelTicket(){
        ticketCancellation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                f8 = new JFrame("Cancel Ticket");
                f8.setSize(600,400);
                f8.setVisible(true);
                f8.setLayout(new BorderLayout());
                f8.getContentPane().setBackground(Color.BLACK);

                ImageIcon icon1 = new ImageIcon("cancel.png");
                f8.setIconImage(icon1.getImage());

                l15 = new JLabel("Enter Destination");    
                l15.setFont(new Font("Arial",Font.BOLD,30));
                l15.setForeground(Color.white);
                l15.setHorizontalAlignment(JLabel.CENTER);

                t7 = new JTextField();
                t7.setFont(new Font("Arial",Font.BOLD,40));
                t7.setBackground(new Color(0, 255, 128));
                t7.setHorizontalAlignment(JLabel.CENTER);

                ok = new JButton("OK");
                ok.setFont(new Font("Arial",Font.BOLD,30));
                ok.setBackground(Color.BLACK);
                ok.setForeground(Color.white);
                f8.add(l15,BorderLayout.NORTH);
                f8.add(t7,BorderLayout.CENTER);
                f8.add(ok,BorderLayout.SOUTH);

                ok.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        JFrame f9 = new JFrame("cancel successfully");
                        f9.setSize(600,400);
                        f9.setVisible(true);
                        f9.getContentPane().setBackground(new Color(0, 255, 128));
                        f9.setLayout(null);

                        ImageIcon icon1 = new ImageIcon("cancel1.jpeg");
                        f9.setIconImage(icon1.getImage());

                        l16 = new JLabel("Ticket Cancelled Successfully");
                        l16.setBounds(50,100,500,50);
                        l16.setFont(new Font("Mv Boli",Font.BOLD,35));
                        l16.setHorizontalAlignment(JLabel.CENTER);
                        f9.add(l16);

                        quit.setBounds(160,200,200,40);
                        f9.add(quit);
                        quit.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e){
                                f8.setVisible(false);
                                f2.setVisible(false);
                                f9.setVisible(false);
                            }
                        });
                    }
                });
            }
        });
    }
}
