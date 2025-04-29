.class final Lz1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz1/a;


# instance fields
.field public final a:Ls1/n1;


# direct methods
.method public constructor <init>(Ls1/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/g;->a:Ls1/n1;

    return-void
.end method

.method private static b(I)Ljava/lang/String;
    .locals 0

    sparse-switch p0, :sswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :sswitch_0
    const-string p0, "video/mjpeg"

    return-object p0

    :sswitch_1
    const-string p0, "video/mp43"

    return-object p0

    :sswitch_2
    const-string p0, "video/mp42"

    return-object p0

    :sswitch_3
    const-string p0, "video/avc"

    return-object p0

    :sswitch_4
    const-string p0, "video/mp4v-es"

    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x30355844 -> :sswitch_4
        0x31435641 -> :sswitch_3
        0x31637661 -> :sswitch_3
        0x3234504d -> :sswitch_2
        0x3334504d -> :sswitch_1
        0x34363248 -> :sswitch_3
        0x34504d46 -> :sswitch_4
        0x44495633 -> :sswitch_4
        0x44495658 -> :sswitch_4
        0x47504a4d -> :sswitch_0
        0x58564944 -> :sswitch_4
        0x64697678 -> :sswitch_4
        0x67706a6d -> :sswitch_0
        0x78766964 -> :sswitch_4
    .end sparse-switch
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/16 v0, 0x55

    if-eq p0, v0, :cond_3

    const/16 v0, 0xff

    if-eq p0, v0, :cond_2

    const/16 v0, 0x2000

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2001

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string p0, "audio/vnd.dts"

    return-object p0

    :cond_1
    const-string p0, "audio/ac3"

    return-object p0

    :cond_2
    const-string p0, "audio/mp4a-latm"

    return-object p0

    :cond_3
    const-string p0, "audio/mpeg"

    return-object p0

    :cond_4
    const-string p0, "audio/raw"

    return-object p0
.end method

.method private static d(Lp3/a0;)Lz1/a;
    .locals 3

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lp3/a0;->U(I)V

    invoke-virtual {p0}, Lp3/a0;->t()I

    move-result v1

    invoke-virtual {p0}, Lp3/a0;->t()I

    move-result v2

    invoke-virtual {p0, v0}, Lp3/a0;->U(I)V

    invoke-virtual {p0}, Lp3/a0;->t()I

    move-result p0

    invoke-static {p0}, Lz1/g;->b(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ignoring track with unsupported compression "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "StreamFormatChunk"

    invoke-static {v0, p0}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p0, Ls1/n1$b;

    invoke-direct {p0}, Ls1/n1$b;-><init>()V

    invoke-virtual {p0, v1}, Ls1/n1$b;->n0(I)Ls1/n1$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Ls1/n1$b;->S(I)Ls1/n1$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    new-instance v0, Lz1/g;

    invoke-virtual {p0}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object p0

    invoke-direct {v0, p0}, Lz1/g;-><init>(Ls1/n1;)V

    return-object v0
.end method

.method public static e(ILp3/a0;)Lz1/a;
    .locals 1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lz1/g;->d(Lp3/a0;)Lz1/a;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    invoke-static {p1}, Lz1/g;->f(Lp3/a0;)Lz1/a;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Ignoring strf box for unsupported track type: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lp3/n0;->k0(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "StreamFormatChunk"

    invoke-static {p1, p0}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static f(Lp3/a0;)Lz1/a;
    .locals 7

    invoke-virtual {p0}, Lp3/a0;->y()I

    move-result v0

    invoke-static {v0}, Lz1/g;->c(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ignoring track with unsupported format tag "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "StreamFormatChunk"

    invoke-static {v0, p0}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lp3/a0;->y()I

    move-result v0

    invoke-virtual {p0}, Lp3/a0;->t()I

    move-result v2

    const/4 v3, 0x6

    invoke-virtual {p0, v3}, Lp3/a0;->U(I)V

    invoke-virtual {p0}, Lp3/a0;->M()I

    move-result v3

    invoke-static {v3}, Lp3/n0;->b0(I)I

    move-result v3

    invoke-virtual {p0}, Lp3/a0;->y()I

    move-result v4

    new-array v5, v4, [B

    const/4 v6, 0x0

    invoke-virtual {p0, v5, v6, v4}, Lp3/a0;->l([BII)V

    new-instance p0, Ls1/n1$b;

    invoke-direct {p0}, Ls1/n1$b;-><init>()V

    invoke-virtual {p0, v1}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v6

    invoke-virtual {v6, v0}, Ls1/n1$b;->J(I)Ls1/n1$b;

    move-result-object v0

    invoke-virtual {v0, v2}, Ls1/n1$b;->h0(I)Ls1/n1$b;

    const-string v0, "audio/raw"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz v3, :cond_1

    invoke-virtual {p0, v3}, Ls1/n1$b;->a0(I)Ls1/n1$b;

    :cond_1
    const-string v0, "audio/mp4a-latm"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-lez v4, :cond_2

    invoke-static {v5}, Lcom/google/common/collect/q;->A(Ljava/lang/Object;)Lcom/google/common/collect/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Ls1/n1$b;->V(Ljava/util/List;)Ls1/n1$b;

    :cond_2
    new-instance v0, Lz1/g;

    invoke-virtual {p0}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object p0

    invoke-direct {v0, p0}, Lz1/g;-><init>(Ls1/n1;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    const v0, 0x66727473

    return v0
.end method
