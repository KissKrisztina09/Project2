% comment
phi = (1+sqrt(5))/2;
x = 3;
for  i=1:17
  x = sqrt(1+x);
 endfor
 x
 abszhiba = abs(x-phi)
 
 xx  = -1:0.1:3;
 yy= sqrt(1+xx);
 plot(xx, yy,, "*", 'color', [1 1 0])
 grid on;hold on
 y2== xx;
 plot(xx, y2)
 