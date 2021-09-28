m_tuple = (1,2,5,(5,8,9,(8,7,1,(5,1))))

n = len(m_tuple)
for i in range(n):
    if type(m_tuple[i]) is tuple:
        if len(m_tuple[i]) >1:
            m = len(m_tuple[i])
            for j in range(m):
                # print(m_tuple[i][j])

                if type(m_tuple[i][j]) is tuple:
                    if len(m_tuple[i][j]) >1:
                        m1 = len(m_tuple[i][j])
                        for k in range(m1):
                            # print(m_tuple[i][j][k])
                            if type(m_tuple[i][j][k]) is tuple:
                                if len(m_tuple[i][j][k]) >1:
                                    m2 = len(m_tuple[i][j][k])
                                    for l in range(m2):
                                        if m_tuple[i][j][k][l] == m_tuple[0] or m_tuple[i][j][k][l]==m_tuple[1] or m_tuple[i][j][k][l]==m_tuple[2]:
                                            print("level 3=", m_tuple[i][j][k][l])
                                        # print(m_tuple[i][j][k][l])
                            else:
                                if m_tuple[i][j][k] == m_tuple[0] or m_tuple[i][j][k]==m_tuple[1] or m_tuple[i][j][k]==m_tuple[2]:
                                    print("level 2=", m_tuple[i][j][k])
                                # print(m_tuple[i][j][k])


                    else:
                        if m_tuple[i][j] ==m_tuple[0] or m_tuple[i][j]==m_tuple[1] or m_tuple[i][j] ==m_tuple[2]:
                            print("level 1=", m_tuple[i][j])
                        # print(m_tuple[i][j])

    else:
        continue
        # if m_tuple[i] ==1 or m_tuple[i]==5:
        #     print("Root level=", m_tuple[i])
        # # print(m_tuple[i])