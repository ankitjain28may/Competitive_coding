#!/bin/python

import sys


n, k = raw_input().strip().split(' ')
n, k = [int(n), int(k)]
rQueen, cQueen = raw_input().strip().split(' ')
rQueen, cQueen = [int(rQueen), int(cQueen)]
obstacle = []
attack = 0
for a0 in xrange(k):
    obstacle.append(":".join(raw_input().strip().split(' ')))

# Right & Left
xr = xl = cQueen
xdr = xdl = rQueen
fl = fr = fdr = fdl = 0
while(True):
    xr += 1
    xdr += 1
    xdl -= 1
    xl -= 1
    sr = str(rQueen) + ":" + str(xr)
    sl = str(rQueen) + ":" + str(xl)
    sdr = str(xdr) + ":" + str(xr)
    sdl = str(xdl) + ":" + str(xl)
    if xr <= n and sr not in obstacle and fr != 1:
        attack += 1
    else:
        fr = 1
    if xl >= 1 and sl not in obstacle and fl != 1:
        attack += 1
    else:
        fl = 1
    if xdr <= n and xr <= n and sdr not in obstacle and fdr != 1:
        attack += 1
    else:
        fdr = 1
    if xdl >= 1 and xl >= 1 and sdl not in obstacle and fdl != 1:
        attack += 1
    else:
        fdl = 1
    if fl == fr == fdl == fdr == 1:
        break

# Top & Bottim
yt = yb = rQueen
fb = ft = 0
while(True):
    yt += 1
    yb -= 1
    st = str(yt) + ":" + str(cQueen)
    sb = str(yb) + ":" + str(cQueen)
    if yt <= n and st not in obstacle and ft != 1:
        attack += 1
    else:
        ft = 1
    if yb >= 1 and sb not in obstacle and fb != 1:
        attack += 1
    else:
        fb = 1
    if ft == fb == 1:
        break


print attack
