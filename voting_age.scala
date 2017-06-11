val votingAge = 18
val isVotingAge = (age: Int) => { age >= votingAge }

println(isVotingAge(20))


def printResult(f: (Int => Boolean), x: Int) = {
  println(f(x))
}


printResult(isVotingAge,14)
