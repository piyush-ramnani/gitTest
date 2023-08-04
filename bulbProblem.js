/*

A wire connects N light bulbs.

Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.

Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on.

Example: A = [0, 1, 0, 1] => Output: 4

Explaination:
 press switch 0 : [1 0 1 0]
 press switch 1 : [1 1 0 1]
 press switch 2 : [1 1 1 0]
 press switch 3 : [1 1 1 1]
*/


module.exports = { 
    //param A : array of integers
    //return an integer
       bulbs : function(A){
   
           let count = 0;
           const n = A.length;
   
           for(let i=0; i<n; i++){
               if(count%2==0){
                   state = A[i];
               } else{
                   state = 1 - A[i];
               }
   
               if(state==0){
                   count++;
               }
           }
           return count;
       }
   };
   