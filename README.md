# LeetCode
## 막힌 부분
### 1962
#### Wrong Answer
```
for (i in 0 until k){
            if (piles[0]==piles[1]+1){
                x = piles[0].toDouble() / 2
                tmp = piles[0]/2
                if (x - tmp >0.1){
                    x += 0.5
                }
                piles[1] = x.toInt()
```
x = piles[0]과 tmp = piles[0]/2의 0을 1로 바꿔주었다 왜냐하면 1번째 인덱스가 나뉘어야 더 작은 수로 바뀌지만 0번째 인덱스의 수를 나누어 정확한 답이 나오지 않았었다.
#### Time Limit Exceeded
