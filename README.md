<h1>Here goes the answer of Part G, Part H, Part I:</h1>

<h2>Part E : LeafTraversal.java File</h2>

<h2>Part F : BFSTreeversal.java File</h2>

<h2>Part G : -</h2>

<h2>Part H</h2>
<p> Under what conditions would a pre-order and a breadth-first traversal be the same?</br><span>1. Linear Tree (Degenerate Tree);</br> 2. Single Node Tree;</br>3. Tree with <strong>only one left child</strong>.</span></p>

<h2>Part I-a</h2>
<p>What is the run time of a traversal that prints out the directory names?</br><span><b>O(n),</b>because per one directory the program only had to checks if the directory whether has files or not, if the directory has <strong>a or more files</strong> then add to the output.</span></p>

<h2>Part I-b</h2>
<p>What is the run time of a traversal that prints out the file names?</br><span><b>O(n + <i>N</i>),</b>because per one directory the program had to checks if the directory whether has files or not, if the directory has <strong>a or more files</strong> then proceed to checks either a single file or for each files then add to the output.</span></p>

<h2>Part I-c</h2>
<p>How does your answer to Part b of this question change if you know that N = Omega(n)?</br><span>Big Omega Notation respectively indicates best cases, it supposed to indicates that the runtime had a little improvement. But since the runtime on the part b was linear, it wont affect the answer that much.</span></p>