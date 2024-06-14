class Solution:
    def reverse(self, x: int) -> int:

        isNegative = True if x<0 else False

        if(isNegative):
            x*=-1

        stX = str(x)

        aux = ""

        for i in stX:
            aux = i+aux

        if(isNegative):
            aux = "-"+aux

        aux = int(aux)

        if( (aux>=(2**31-1)) or aux<=(-2**31) ): return 0

        return aux