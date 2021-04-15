/*
Math - Pythagorean Triples

The Problem with 7825 - Numberphile
https://www.youtube.com/watch?v=1gBwexpG0IY

03:10
04:14

M, N, where M > N

a = M^2 - N^2
b = 2MN
c = M^2 + N^2

Pick any 2 positive integers for M and N and you get a,b,c - a Pythagorean Triple.


If you colour pythagorean triples in red or blue
so that all 3 are NOT all the same colour (e.g. 2 x red and 1 x blue, or vica versa)
and keep going until there is a problem.
i.e. one of the numbers in the pythagorean triple
is already red and now must be blue (or vica versa).

This works for all integers up to 7,825 - that is when it fails.
It is the straw that broke the camel's back.

 625^2 + 7800^2 = 7,825^2
5180^2 + 5865^2 = 7,825^2

To check a set of solution up to 7,825 takes a short time ... seconds.

To check all possible combinations ...

2^7825
==> all of the computers in earth running since the Big Bang and they still wont have found the all possible solutions.

All combinations have now been checked by using mathemetical tricks and constraints to reduce the number of combinations down to about 1 trillion and these were checked by super computer at University of Texas.

We don't know WHY 7,825 fails.

More on the proof:
* https://www.cs.utexas.edu/~marijn/ptn/?

Preprint of the paper:
* https://arxiv.org/abs/1605.00723

*/
public class PythagoreanTriples
{
   public static void main (String[] args)
   {
      int MAX = 10;

      for (int m = 1; m < MAX; m++)
      {
         for (int n = 1; n < m; n++)
         {
            int a = m * m - n * n;
            int b = 2 * m * n;
            int c = m * m + n * n;

            System.out.println (a + "\t" + b + "\t" + c);
         }
      }

   }
}