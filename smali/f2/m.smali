.class final Lf2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/m$a;
    }
.end annotation


# static fields
.field private static final d:Lb5/q;

.field private static final e:Lb5/q;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lf2/m$a;",
            ">;"
        }
    .end annotation
.end field

.field private b:I

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3a

    invoke-static {v0}, Lb5/q;->d(C)Lb5/q;

    move-result-object v0

    sput-object v0, Lf2/m;->d:Lb5/q;

    const/16 v0, 0x2a

    invoke-static {v0}, Lb5/q;->d(C)Lb5/q;

    move-result-object v0

    sput-object v0, Lf2/m;->e:Lb5/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf2/m;->a:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lf2/m;->b:I

    return-void
.end method

.method private a(Lx1/m;Lx1/a0;)V
    .locals 4

    new-instance v0, Lp3/a0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lp3/a0;-><init>(I)V

    invoke-virtual {v0}, Lp3/a0;->e()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p1, v2, v3, v1}, Lx1/m;->readFully([BII)V

    invoke-virtual {v0}, Lp3/a0;->t()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, p0, Lf2/m;->c:I

    invoke-virtual {v0}, Lp3/a0;->p()I

    move-result v0

    const v1, 0x53454654

    if-eq v0, v1, :cond_0

    const-wide/16 v0, 0x0

    iput-wide v0, p2, Lx1/a0;->a:J

    return-void

    :cond_0
    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v0

    iget p1, p0, Lf2/m;->c:I

    add-int/lit8 p1, p1, -0xc

    int-to-long v2, p1

    sub-long/2addr v0, v2

    iput-wide v0, p2, Lx1/a0;->a:J

    const/4 p1, 0x2

    iput p1, p0, Lf2/m;->b:I

    return-void
.end method

.method private static b(Ljava/lang/String;)I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "Super_SlowMotion_BGM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_1
    const-string v0, "Super_SlowMotion_Deflickering_On"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_2
    const-string v0, "Super_SlowMotion_Data"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "Super_SlowMotion_Edit_Data"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_4
    const-string v0, "SlowMotion_Data"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    const/4 p0, 0x0

    const-string v0, "Invalid SEF name"

    invoke-static {v0, p0}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p0

    throw p0

    :pswitch_0
    const/16 p0, 0xb01

    return p0

    :pswitch_1
    const/16 p0, 0xb04

    return p0

    :pswitch_2
    const/16 p0, 0xb00

    return p0

    :pswitch_3
    const/16 p0, 0xb03

    return p0

    :pswitch_4
    const/16 p0, 0x890

    return p0

    :sswitch_data_0
    .sparse-switch
        -0x6604662e -> :sswitch_4
        -0x4f6659e5 -> :sswitch_3
        -0x4a96a712 -> :sswitch_2
        -0x3182f331 -> :sswitch_1
        0x68f2d704 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private d(Lx1/m;Lx1/a0;)V
    .locals 12

    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v0

    iget v2, p0, Lf2/m;->c:I

    add-int/lit8 v2, v2, -0xc

    const/16 v3, 0x8

    sub-int/2addr v2, v3

    new-instance v4, Lp3/a0;

    invoke-direct {v4, v2}, Lp3/a0;-><init>(I)V

    invoke-virtual {v4}, Lp3/a0;->e()[B

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {p1, v5, v6, v2}, Lx1/m;->readFully([BII)V

    const/4 p1, 0x0

    :goto_0
    div-int/lit8 v5, v2, 0xc

    if-ge p1, v5, :cond_1

    const/4 v5, 0x2

    invoke-virtual {v4, v5}, Lp3/a0;->U(I)V

    invoke-virtual {v4}, Lp3/a0;->v()S

    move-result v5

    const/16 v7, 0x890

    if-eq v5, v7, :cond_0

    const/16 v7, 0xb00

    if-eq v5, v7, :cond_0

    const/16 v7, 0xb01

    if-eq v5, v7, :cond_0

    const/16 v7, 0xb03

    if-eq v5, v7, :cond_0

    const/16 v7, 0xb04

    if-eq v5, v7, :cond_0

    invoke-virtual {v4, v3}, Lp3/a0;->U(I)V

    goto :goto_1

    :cond_0
    iget v7, p0, Lf2/m;->c:I

    int-to-long v7, v7

    sub-long v7, v0, v7

    invoke-virtual {v4}, Lp3/a0;->t()I

    move-result v9

    int-to-long v9, v9

    sub-long/2addr v7, v9

    invoke-virtual {v4}, Lp3/a0;->t()I

    move-result v9

    iget-object v10, p0, Lf2/m;->a:Ljava/util/List;

    new-instance v11, Lf2/m$a;

    invoke-direct {v11, v5, v7, v8, v9}, Lf2/m$a;-><init>(IJI)V

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lf2/m;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    const-wide/16 v0, 0x0

    :goto_2
    iput-wide v0, p2, Lx1/a0;->a:J

    return-void

    :cond_2
    const/4 p1, 0x3

    iput p1, p0, Lf2/m;->b:I

    iget-object p1, p0, Lf2/m;->a:Ljava/util/List;

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf2/m$a;

    iget-wide v0, p1, Lf2/m$a;->b:J

    goto :goto_2
.end method

.method private e(Lx1/m;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/m;",
            "Ljava/util/List<",
            "Lk2/a$b;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v0

    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v2

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget v4, p0, Lf2/m;->c:I

    int-to-long v4, v4

    sub-long/2addr v2, v4

    long-to-int v3, v2

    new-instance v2, Lp3/a0;

    invoke-direct {v2, v3}, Lp3/a0;-><init>(I)V

    invoke-virtual {v2}, Lp3/a0;->e()[B

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {p1, v4, v5, v3}, Lx1/m;->readFully([BII)V

    :goto_0
    iget-object p1, p0, Lf2/m;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ge v5, p1, :cond_3

    iget-object p1, p0, Lf2/m;->a:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf2/m$a;

    iget-wide v3, p1, Lf2/m$a;->b:J

    sub-long/2addr v3, v0

    long-to-int v4, v3

    invoke-virtual {v2, v4}, Lp3/a0;->T(I)V

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Lp3/a0;->U(I)V

    invoke-virtual {v2}, Lp3/a0;->t()I

    move-result v3

    invoke-virtual {v2, v3}, Lp3/a0;->D(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lf2/m;->b(Ljava/lang/String;)I

    move-result v4

    iget p1, p1, Lf2/m$a;->c:I

    add-int/lit8 v3, v3, 0x8

    sub-int/2addr p1, v3

    const/16 v3, 0x890

    if-eq v4, v3, :cond_1

    const/16 p1, 0xb00

    if-eq v4, p1, :cond_2

    const/16 p1, 0xb01

    if-eq v4, p1, :cond_2

    const/16 p1, 0xb03

    if-eq v4, p1, :cond_2

    const/16 p1, 0xb04

    if-ne v4, p1, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-static {v2, p1}, Lf2/m;->f(Lp3/a0;I)Lq2/c;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private static f(Lp3/a0;I)Lq2/c;
    .locals 12

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1}, Lp3/a0;->D(I)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Lf2/m;->e:Lb5/q;

    invoke-virtual {p1, p0}, Lb5/q;->f(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    sget-object v2, Lf2/m;->d:Lb5/q;

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Lb5/q;->f(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x3

    const/4 v5, 0x0

    if-ne v3, v4, :cond_0

    :try_start_0
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    const/4 v4, 0x2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    sub-int/2addr v2, v3

    shl-int v11, v3, v2

    new-instance v2, Lq2/c$b;

    move-object v6, v2

    invoke-direct/range {v6 .. v11}, Lq2/c$b;-><init>(JJI)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-static {v5, p0}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p0

    throw p0

    :cond_0
    invoke-static {v5, v5}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p0

    throw p0

    :cond_1
    new-instance p0, Lq2/c;

    invoke-direct {p0, v0}, Lq2/c;-><init>(Ljava/util/List;)V

    return-object p0
.end method


# virtual methods
.method public c(Lx1/m;Lx1/a0;Ljava/util/List;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/m;",
            "Lx1/a0;",
            "Ljava/util/List<",
            "Lk2/a$b;",
            ">;)I"
        }
    .end annotation

    iget v0, p0, Lf2/m;->b:I

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_2

    const/4 v4, 0x2

    if-eq v0, v4, :cond_1

    const/4 v4, 0x3

    if-ne v0, v4, :cond_0

    invoke-direct {p0, p1, p3}, Lf2/m;->e(Lx1/m;Ljava/util/List;)V

    iput-wide v1, p2, Lx1/a0;->a:J

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0, p1, p2}, Lf2/m;->d(Lx1/m;Lx1/a0;)V

    goto :goto_1

    :cond_2
    invoke-direct {p0, p1, p2}, Lf2/m;->a(Lx1/m;Lx1/a0;)V

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long p1, v4, v6

    if-eqz p1, :cond_5

    const-wide/16 v6, 0x8

    cmp-long p1, v4, v6

    if-gez p1, :cond_4

    goto :goto_0

    :cond_4
    sub-long v1, v4, v6

    :cond_5
    :goto_0
    iput-wide v1, p2, Lx1/a0;->a:J

    iput v3, p0, Lf2/m;->b:I

    :goto_1
    return v3
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lf2/m;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Lf2/m;->b:I

    return-void
.end method
