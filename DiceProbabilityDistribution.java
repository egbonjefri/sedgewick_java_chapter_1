public class DiceProbabilityDistribution {
    public static void main(String args[]) {
        int[] frequencies = new int[13];
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 6; j++){
            frequencies[i+j]++; 
        }
        }
    
        double[] probabilities = new double[13];
        for (int k = 1; k <= 12; k++){
            probabilities[k] = frequencies[k] / 36.0;
        }
        double n = Double.parseDouble(args[0]);
        double[] diceFrequencies = new double[13];
        for(int i = 0; i < n; i++){
            int k = (int) Math.floor(Math.random()*6)+1;
            int j = (int) Math.floor(Math.random()*6)+1;
            diceFrequencies[k+j]+=1;
        }
        for(int i = 0; i < diceFrequencies.length; i++){
            diceFrequencies[i] = diceFrequencies[i]/n;
        }
        System.out.println("Dice Frequencies:");
        for (double element : diceFrequencies) {
            System.out.println(element);
        }
        }
}
/*
 * 
The inversion of a permutation is a fundamental concept in combinatorics and discrete mathematics. To understand this concept, it's important to first define what a permutation is and then explore what its inversion entails.

Permutation:
A permutation of a set is an arrangement of its members into a sequence or linear order. For a set of 
�
n elements, a permutation is a specific ordering of all 
�
n elements. For example, if we have a set 
{
0
,
1
,
2
}
{0,1,2}, then 
2
,
0
,
1
2,0,1 is one possible permutation.

Inverse of a Permutation:
The inverse of a permutation is another permutation that, when applied after the original permutation, returns the elements to their original order. In more formal terms, a permutation 
�
π maps elements from positions to values. The inverse permutation, denoted 
�
−
1
π 
−1
 , reverses this mapping, taking values back to their original positions.

How Inversion Works:
Mapping: Consider a permutation as a function that maps an index to a value. For instance, in the permutation 
�
=
[
2
,
0
,
1
]
π=[2,0,1], 
�
(
0
)
=
2
π(0)=2, 
�
(
1
)
=
0
π(1)=0, and 
�
(
2
)
=
1
π(2)=1.

Inverse Mapping: The inverse permutation reverses this mapping. So for 
�
−
1
π 
−1
 , 
�
−
1
(
2
)
=
0
π 
−1
 (2)=0, 
�
−
1
(
0
)
=
1
π 
−1
 (0)=1, and 
�
−
1
(
1
)
=
2
π 
−1
 (1)=2.

Composition: The composition of a permutation and its inverse yields the identity permutation. In other words, 
�
(
�
−
1
(
�
)
)
=
�
π(π 
−1
 (i))=i for all elements 
�
i in the set.

Example:
Let's take a permutation 
�
=
[
2
,
0
,
1
]
π=[2,0,1]. The inverse 
�
−
1
π 
−1
  is constructed as follows:

The first element of 
�
π (which is 2) goes to position 0 in 
�
−
1
π 
−1
 .
The second element of 
�
π (which is 0) goes to position 1 in 
�
−
1
π 
−1
 .
The third element of 
�
π (which is 1) goes to position 2 in 
�
−
1
π 
−1
 .
So, 
�
−
1
=
[
1
,
2
,
0
]
π 
−1
 =[1,2,0].

Mathematical Properties:
Uniqueness: Every permutation has a unique inverse.
Symmetry: The inverse of the inverse of a permutation is the original permutation itself, i.e., 
(
�
−
1
)
−
1
=
�
(π 
−1
 ) 
−1
 =π.
Order: The inverse of a permutation of 
�
n elements is also a permutation of those 
�
n elements.
Understanding the inverse of a permutation is crucial in various fields, including algebra, combinatorics, and computer science, especially in problems involving sorting, rearranging elements, and in the study of symmetries and group theory.




User
okay lets say i have a permutation 2,0,1 and its inverse is 1,2,0, how do i apply this to get 0,1,2
ChatGPT
To apply the inverse permutation to the original permutation and obtain the identity permutation (which is the ordered sequence 0, 1, 2, ... in this case), you essentially rearrange the elements of the original permutation according to the positions indicated by the inverse permutation. Let's go through this step-by-step with your example:

Original Permutation:
�
=
[
2
,
0
,
1
]
π=[2,0,1]
Inverse Permutation:
�
−
1
=
[
1
,
2
,
0
]
π 
−1
 =[1,2,0]
Applying the Inverse:
To apply the inverse permutation 
�
−
1
π 
−1
  to the original permutation 
�
π, follow these steps:

Look at the First Element of the Inverse: 
�
−
1
[
0
]
=
1
π 
−1
 [0]=1. This means that the element at index 1 of the original permutation 
�
π should be placed at index 0 of the new permutation. In 
�
π, the element at index 1 is 0.

Look at the Second Element of the Inverse: 
�
−
1
[
1
]
=
2
π 
−1
 [1]=2. This means that the element at index 2 of 
�
π should be placed at index 1 of the new permutation. In 
�
π, the element at index 2 is 1.

Look at the Third Element of the Inverse: 
�
−
1
[
2
]
=
0
π 
−1
 [2]=0. This means that the element at index 0 of 
�
π should be placed at index 2 of the new permutation. In 
�
π, the element at index 0 is 2.

Resulting Permutation:
Following these steps, you place the elements in the new order: 
[
0
,
1
,
2
]
[0,1,2].

Verification:
You can verify this by noting that applying the inverse permutation reorders the original permutation back to the identity permutation (the natural ordered sequence).

So, by applying the inverse permutation 
�
−
1
=
[
1
,
2
,
0
]
π 
−1
 =[1,2,0] to the original permutation 
�
=
[
2
,
0
,
1
]
π=[2,0,1], you get the ordered sequence 
[
0
,
1
,
2
]
[0,1,2], which is the identity permutation for a set of three 
 */