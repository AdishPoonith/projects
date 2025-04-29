.class public final Lm6/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ld7/b0;)Lcom/google/protobuf/t1;
    .locals 1

    invoke-virtual {p0}, Ld7/b0;->x0()Ld7/s;

    move-result-object p0

    const-string v0, "__local_write_time__"

    invoke-virtual {p0, v0}, Ld7/s;->k0(Ljava/lang/String;)Ld7/b0;

    move-result-object p0

    invoke-virtual {p0}, Ld7/b0;->A0()Lcom/google/protobuf/t1;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ld7/b0;)Ld7/b0;
    .locals 2

    invoke-virtual {p0}, Ld7/b0;->x0()Ld7/s;

    move-result-object p0

    const-string v0, "__previous_value__"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ld7/s;->j0(Ljava/lang/String;Ld7/b0;)Ld7/b0;

    move-result-object p0

    invoke-static {p0}, Lm6/v;->c(Ld7/b0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lm6/v;->b(Ld7/b0;)Ld7/b0;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static c(Ld7/b0;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ld7/b0;->x0()Ld7/s;

    move-result-object p0

    const-string v1, "__type__"

    invoke-virtual {p0, v1, v0}, Ld7/s;->j0(Ljava/lang/String;Ld7/b0;)Ld7/b0;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ld7/b0;->z0()Ljava/lang/String;

    move-result-object p0

    const-string v0, "server_timestamp"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static d(Lw5/q;Ld7/b0;)Ld7/b0;
    .locals 5

    invoke-static {}, Ld7/b0;->C0()Ld7/b0$b;

    move-result-object v0

    const-string v1, "server_timestamp"

    invoke-virtual {v0, v1}, Ld7/b0$b;->T(Ljava/lang/String;)Ld7/b0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object v0

    check-cast v0, Ld7/b0;

    invoke-static {}, Ld7/b0;->C0()Ld7/b0$b;

    move-result-object v1

    invoke-static {}, Lcom/google/protobuf/t1;->k0()Lcom/google/protobuf/t1$b;

    move-result-object v2

    invoke-virtual {p0}, Lw5/q;->l()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/google/protobuf/t1$b;->I(J)Lcom/google/protobuf/t1$b;

    move-result-object v2

    invoke-virtual {p0}, Lw5/q;->k()I

    move-result p0

    invoke-virtual {v2, p0}, Lcom/google/protobuf/t1$b;->H(I)Lcom/google/protobuf/t1$b;

    move-result-object p0

    invoke-virtual {v1, p0}, Ld7/b0$b;->U(Lcom/google/protobuf/t1$b;)Ld7/b0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p0

    check-cast p0, Ld7/b0;

    invoke-static {}, Ld7/s;->o0()Ld7/s$b;

    move-result-object v1

    const-string v2, "__type__"

    invoke-virtual {v1, v2, v0}, Ld7/s$b;->J(Ljava/lang/String;Ld7/b0;)Ld7/s$b;

    move-result-object v0

    const-string v1, "__local_write_time__"

    invoke-virtual {v0, v1, p0}, Ld7/s$b;->J(Ljava/lang/String;Ld7/b0;)Ld7/s$b;

    move-result-object p0

    invoke-static {p1}, Lm6/v;->c(Ld7/b0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lm6/v;->b(Ld7/b0;)Ld7/b0;

    move-result-object p1

    :cond_0
    if-eqz p1, :cond_1

    const-string v0, "__previous_value__"

    invoke-virtual {p0, v0, p1}, Ld7/s$b;->J(Ljava/lang/String;Ld7/b0;)Ld7/s$b;

    :cond_1
    invoke-static {}, Ld7/b0;->C0()Ld7/b0$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Ld7/b0$b;->P(Ld7/s$b;)Ld7/b0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p0

    check-cast p0, Ld7/b0;

    return-object p0
.end method
