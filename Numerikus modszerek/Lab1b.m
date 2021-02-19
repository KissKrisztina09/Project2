% comment
phi = (1+sqrt(5))/2;
x = 3;
epsd = 10^-5
k =0 ;
while(abszhiba > epsd)
  abszhiba = abs(x-phi);
  x = sqrt(1+x);
  k = k+1;
endwhile
 x
 abszhiba = abs(x-phi)
 
 xx  = -1:0.1:3;
 yy= sqrt(1+xx);
 plot(xx, yy)
 grid on;hold on
 y2 = xx;
 plot(xx, y2)
 k