.class public final Le3/c;
.super Le3/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le3/c$a;,
        Le3/c$b;,
        Le3/c$c;
    }
.end annotation


# instance fields
.field private final g:Lp3/a0;

.field private final h:Lp3/z;

.field private i:I

.field private final j:Z

.field private final k:I

.field private final l:[Le3/c$b;

.field private m:Le3/c$b;

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld3/b;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld3/b;",
            ">;"
        }
    .end annotation
.end field

.field private p:Le3/c$c;

.field private q:I


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "[B>;)V"
        }
    .end annotation

    invoke-direct {p0}, Le3/e;-><init>()V

    new-instance v0, Lp3/a0;

    invoke-direct {v0}, Lp3/a0;-><init>()V

    iput-object v0, p0, Le3/c;->g:Lp3/a0;

    new-instance v0, Lp3/z;

    invoke-direct {v0}, Lp3/z;-><init>()V

    iput-object v0, p0, Le3/c;->h:Lp3/z;

    const/4 v0, -0x1

    iput v0, p0, Le3/c;->i:I

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    :cond_0
    iput p1, p0, Le3/c;->k:I

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    invoke-static {p2}, Lp3/e;->h(Ljava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Le3/c;->j:Z

    const/16 p2, 0x8

    new-array v0, p2, [Le3/c$b;

    iput-object v0, p0, Le3/c;->l:[Le3/c$b;

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p2, :cond_2

    iget-object v1, p0, Le3/c;->l:[Le3/c$b;

    new-instance v2, Le3/c$b;

    invoke-direct {v2}, Le3/c$b;-><init>()V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iget-object p2, p0, Le3/c;->l:[Le3/c$b;

    aget-object p1, p2, p1

    iput-object p1, p0, Le3/c;->m:Le3/c$b;

    return-void
.end method

.method private A()V
    .locals 10

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lp3/z;->h(I)I

    move-result v3

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lp3/z;->h(I)I

    move-result v4

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0, v1}, Lp3/z;->h(I)I

    move-result v5

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0}, Lp3/z;->g()Z

    move-result v6

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0}, Lp3/z;->g()Z

    move-result v7

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lp3/z;->h(I)I

    move-result v8

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0, v1}, Lp3/z;->h(I)I

    move-result v9

    iget-object v2, p0, Le3/c;->m:Le3/c$b;

    invoke-virtual/range {v2 .. v9}, Le3/c$b;->m(IIIZZII)V

    return-void
.end method

.method private B()V
    .locals 6

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lp3/z;->h(I)I

    move-result v0

    iget-object v2, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v2, v1}, Lp3/z;->h(I)I

    move-result v2

    iget-object v3, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v3, v1}, Lp3/z;->h(I)I

    move-result v3

    iget-object v4, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v4, v1}, Lp3/z;->h(I)I

    move-result v4

    invoke-static {v2, v3, v4, v0}, Le3/c$b;->h(IIII)I

    move-result v0

    iget-object v2, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v2, v1}, Lp3/z;->h(I)I

    move-result v2

    iget-object v3, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v3, v1}, Lp3/z;->h(I)I

    move-result v3

    iget-object v4, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v4, v1}, Lp3/z;->h(I)I

    move-result v4

    iget-object v5, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v5, v1}, Lp3/z;->h(I)I

    move-result v5

    invoke-static {v3, v4, v5, v2}, Le3/c$b;->h(IIII)I

    move-result v2

    iget-object v3, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v3, v1}, Lp3/z;->r(I)V

    iget-object v3, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v3, v1}, Lp3/z;->h(I)I

    move-result v3

    iget-object v4, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v4, v1}, Lp3/z;->h(I)I

    move-result v4

    iget-object v5, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v5, v1}, Lp3/z;->h(I)I

    move-result v1

    invoke-static {v3, v4, v1}, Le3/c$b;->g(III)I

    move-result v1

    iget-object v3, p0, Le3/c;->m:Le3/c$b;

    invoke-virtual {v3, v0, v2, v1}, Le3/c$b;->n(III)V

    return-void
.end method

.method private C()V
    .locals 3

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lp3/z;->r(I)V

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0, v1}, Lp3/z;->h(I)I

    move-result v0

    iget-object v1, p0, Le3/c;->h:Lp3/z;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lp3/z;->r(I)V

    iget-object v1, p0, Le3/c;->h:Lp3/z;

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lp3/z;->h(I)I

    move-result v1

    iget-object v2, p0, Le3/c;->m:Le3/c$b;

    invoke-virtual {v2, v0, v1}, Le3/c$b;->o(II)V

    return-void
.end method

.method private D()V
    .locals 13

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lp3/z;->h(I)I

    move-result v0

    iget-object v2, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v2, v1}, Lp3/z;->h(I)I

    move-result v2

    iget-object v3, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v3, v1}, Lp3/z;->h(I)I

    move-result v3

    iget-object v4, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v4, v1}, Lp3/z;->h(I)I

    move-result v4

    invoke-static {v2, v3, v4, v0}, Le3/c$b;->h(IIII)I

    move-result v6

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0, v1}, Lp3/z;->h(I)I

    move-result v0

    iget-object v2, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v2, v1}, Lp3/z;->h(I)I

    move-result v2

    iget-object v3, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v3, v1}, Lp3/z;->h(I)I

    move-result v3

    iget-object v4, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v4, v1}, Lp3/z;->h(I)I

    move-result v4

    invoke-static {v2, v3, v4}, Le3/c$b;->g(III)I

    move-result v7

    iget-object v2, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v2}, Lp3/z;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    or-int/lit8 v0, v0, 0x4

    :cond_0
    move v9, v0

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0}, Lp3/z;->g()Z

    move-result v8

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0, v1}, Lp3/z;->h(I)I

    move-result v10

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0, v1}, Lp3/z;->h(I)I

    move-result v11

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0, v1}, Lp3/z;->h(I)I

    move-result v12

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lp3/z;->r(I)V

    iget-object v5, p0, Le3/c;->m:Le3/c$b;

    invoke-virtual/range {v5 .. v12}, Le3/c$b;->q(IIZIIII)V

    return-void
.end method

.method private E()V
    .locals 12

    iget-object v0, p0, Le3/c;->p:Le3/c$c;

    iget v1, v0, Le3/c$c;->d:I

    iget v0, v0, Le3/c$c;->b:I

    const/4 v2, 0x2

    mul-int/lit8 v0, v0, 0x2

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    const-string v4, "Cea708Decoder"

    if-eq v1, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DtvCcPacket ended prematurely; size is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le3/c;->p:Le3/c$c;

    iget v1, v1, Le3/c$c;->b:I

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", but current index is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le3/c;->p:Le3/c$c;

    iget v1, v1, Le3/c$c;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " (sequence number "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le3/c;->p:Le3/c$c;

    iget v1, v1, Le3/c$c;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ");"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lp3/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Le3/c;->h:Lp3/z;

    iget-object v5, p0, Le3/c;->p:Le3/c$c;

    iget-object v6, v5, Le3/c$c;->c:[B

    iget v5, v5, Le3/c$c;->d:I

    invoke-virtual {v1, v6, v5}, Lp3/z;->o([BI)V

    :cond_1
    :goto_0
    iget-object v1, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v1}, Lp3/z;->b()I

    move-result v1

    if-lez v1, :cond_e

    iget-object v1, p0, Le3/c;->h:Lp3/z;

    const/4 v5, 0x3

    invoke-virtual {v1, v5}, Lp3/z;->h(I)I

    move-result v1

    iget-object v5, p0, Le3/c;->h:Lp3/z;

    const/4 v6, 0x5

    invoke-virtual {v5, v6}, Lp3/z;->h(I)I

    move-result v5

    const/4 v6, 0x7

    if-ne v1, v6, :cond_2

    iget-object v1, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v1, v2}, Lp3/z;->r(I)V

    iget-object v1, p0, Le3/c;->h:Lp3/z;

    const/4 v7, 0x6

    invoke-virtual {v1, v7}, Lp3/z;->h(I)I

    move-result v1

    if-ge v1, v6, :cond_2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid extended service number: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    if-nez v5, :cond_3

    if-eqz v1, :cond_e

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "serviceNumber is non-zero ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") when blockSize is 0"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_3
    iget v6, p0, Le3/c;->k:I

    if-eq v1, v6, :cond_4

    iget-object v1, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v1, v5}, Lp3/z;->s(I)V

    goto :goto_0

    :cond_4
    iget-object v1, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v1}, Lp3/z;->e()I

    move-result v1

    mul-int/lit8 v5, v5, 0x8

    add-int/2addr v1, v5

    :goto_1
    iget-object v5, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v5}, Lp3/z;->e()I

    move-result v5

    if-ge v5, v1, :cond_1

    iget-object v5, p0, Le3/c;->h:Lp3/z;

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Lp3/z;->h(I)I

    move-result v5

    const/16 v7, 0x10

    const/16 v8, 0xff

    const/16 v9, 0x9f

    const/16 v10, 0x7f

    const/16 v11, 0x1f

    if-eq v5, v7, :cond_9

    if-gt v5, v11, :cond_5

    invoke-direct {p0, v5}, Le3/c;->r(I)V

    goto :goto_1

    :cond_5
    if-gt v5, v10, :cond_6

    invoke-direct {p0, v5}, Le3/c;->w(I)V

    goto :goto_2

    :cond_6
    if-gt v5, v9, :cond_7

    invoke-direct {p0, v5}, Le3/c;->s(I)V

    goto :goto_2

    :cond_7
    if-gt v5, v8, :cond_8

    invoke-direct {p0, v5}, Le3/c;->x(I)V

    goto :goto_2

    :cond_8
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid base command: "

    goto :goto_3

    :cond_9
    iget-object v5, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v5, v6}, Lp3/z;->h(I)I

    move-result v5

    if-gt v5, v11, :cond_a

    invoke-direct {p0, v5}, Le3/c;->t(I)V

    goto :goto_1

    :cond_a
    if-gt v5, v10, :cond_b

    invoke-direct {p0, v5}, Le3/c;->y(I)V

    :goto_2
    const/4 v0, 0x1

    goto :goto_1

    :cond_b
    if-gt v5, v9, :cond_c

    invoke-direct {p0, v5}, Le3/c;->u(I)V

    goto :goto_1

    :cond_c
    if-gt v5, v8, :cond_d

    invoke-direct {p0, v5}, Le3/c;->z(I)V

    goto :goto_2

    :cond_d
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Invalid extended command: "

    :goto_3
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_e
    :goto_4
    if-eqz v0, :cond_f

    invoke-direct {p0}, Le3/c;->q()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Le3/c;->n:Ljava/util/List;

    :cond_f
    return-void
.end method

.method private F()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Le3/c;->l:[Le3/c$b;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Le3/c$b;->l()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private p()V
    .locals 1

    iget-object v0, p0, Le3/c;->p:Le3/c$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Le3/c;->E()V

    const/4 v0, 0x0

    iput-object v0, p0, Le3/c;->p:Le3/c$c;

    return-void
.end method

.method private q()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld3/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Le3/c;->l:[Le3/c$b;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Le3/c$b;->j()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Le3/c;->l:[Le3/c$b;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Le3/c$b;->k()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Le3/c;->l:[Le3/c$b;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Le3/c$b;->c()Le3/c$a;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Le3/c$a;->b()Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le3/c$a;

    iget-object v3, v3, Le3/c$a;->a:Ld3/b;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private r(I)V
    .locals 4

    if-eqz p1, :cond_4

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/16 v0, 0x8

    if-eq p1, v0, :cond_2

    packed-switch p1, :pswitch_data_0

    const/16 v1, 0x11

    const-string v2, "Cea708Decoder"

    if-lt p1, v1, :cond_0

    const/16 v1, 0x17

    if-gt p1, v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Currently unsupported COMMAND_EXT1 Command: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    :goto_0
    invoke-virtual {p1, v0}, Lp3/z;->r(I)V

    goto :goto_1

    :cond_0
    const/16 v0, 0x18

    if-lt p1, v0, :cond_1

    const/16 v0, 0x1f

    if-gt p1, v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Currently unsupported COMMAND_P16 Command: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    const/16 v0, 0x10

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid C0 command: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_0
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Le3/c$b;->a(C)V

    goto :goto_1

    :pswitch_1
    invoke-direct {p0}, Le3/c;->F()V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    invoke-virtual {p1}, Le3/c$b;->b()V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Le3/c;->q()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Le3/c;->n:Ljava/util/List;

    :cond_4
    :goto_1
    :pswitch_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private s(I)V
    .locals 4

    const/16 v0, 0x10

    const/16 v1, 0x8

    const/4 v2, 0x1

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid C1 command: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Cea708Decoder"

    invoke-static {v0, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_8

    :pswitch_1
    add-int/lit16 p1, p1, -0x98

    invoke-direct {p0, p1}, Le3/c;->v(I)V

    iget v0, p0, Le3/c;->q:I

    if-eq v0, p1, :cond_9

    iput p1, p0, Le3/c;->q:I

    iget-object v0, p0, Le3/c;->l:[Le3/c$b;

    aget-object p1, v0, p1

    goto/16 :goto_7

    :pswitch_2
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    invoke-virtual {p1}, Le3/c$b;->i()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    const/16 v0, 0x20

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Le3/c;->D()V

    goto/16 :goto_8

    :pswitch_3
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    invoke-virtual {p1}, Le3/c$b;->i()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Le3/c;->C()V

    goto/16 :goto_8

    :pswitch_4
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    invoke-virtual {p1}, Le3/c$b;->i()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    const/16 v0, 0x18

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Le3/c;->B()V

    goto/16 :goto_8

    :pswitch_5
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    invoke-virtual {p1}, Le3/c$b;->i()Z

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    iget-object p1, p0, Le3/c;->h:Lp3/z;

    :goto_1
    invoke-virtual {p1, v0}, Lp3/z;->r(I)V

    goto/16 :goto_8

    :cond_3
    invoke-direct {p0}, Le3/c;->A()V

    goto/16 :goto_8

    :pswitch_6
    invoke-direct {p0}, Le3/c;->F()V

    goto/16 :goto_8

    :pswitch_7
    iget-object p1, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {p1, v1}, Lp3/z;->r(I)V

    goto/16 :goto_8

    :goto_2
    :pswitch_8
    if-gt v2, v1, :cond_9

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {p1}, Lp3/z;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Le3/c;->l:[Le3/c$b;

    rsub-int/lit8 v0, v2, 0x8

    aget-object p1, p1, v0

    invoke-virtual {p1}, Le3/c$b;->l()V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :pswitch_9
    const/4 p1, 0x1

    :goto_3
    if-gt p1, v1, :cond_9

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0}, Lp3/z;->g()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Le3/c;->l:[Le3/c$b;

    rsub-int/lit8 v3, p1, 0x8

    aget-object v0, v0, v3

    invoke-virtual {v0}, Le3/c$b;->k()Z

    move-result v3

    xor-int/2addr v3, v2

    invoke-virtual {v0, v3}, Le3/c$b;->p(Z)V

    :cond_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :goto_4
    :pswitch_a
    if-gt v2, v1, :cond_9

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {p1}, Lp3/z;->g()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Le3/c;->l:[Le3/c$b;

    rsub-int/lit8 v0, v2, 0x8

    aget-object p1, p1, v0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Le3/c$b;->p(Z)V

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :pswitch_b
    const/4 p1, 0x1

    :goto_5
    if-gt p1, v1, :cond_9

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0}, Lp3/z;->g()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Le3/c;->l:[Le3/c$b;

    rsub-int/lit8 v3, p1, 0x8

    aget-object v0, v0, v3

    invoke-virtual {v0, v2}, Le3/c$b;->p(Z)V

    :cond_7
    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    :goto_6
    :pswitch_c
    if-gt v2, v1, :cond_9

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {p1}, Lp3/z;->g()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Le3/c;->l:[Le3/c$b;

    rsub-int/lit8 v0, v2, 0x8

    aget-object p1, p1, v0

    invoke-virtual {p1}, Le3/c$b;->e()V

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :pswitch_d
    add-int/lit8 p1, p1, -0x80

    iget v0, p0, Le3/c;->q:I

    if-eq v0, p1, :cond_9

    iput p1, p0, Le3/c;->q:I

    iget-object v0, p0, Le3/c;->l:[Le3/c$b;

    aget-object p1, v0, p1

    :goto_7
    iput-object p1, p0, Le3/c;->m:Le3/c$b;

    :cond_9
    :goto_8
    :pswitch_e
    return-void

    :pswitch_data_0
    .packed-switch 0x80
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_e
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private t(I)V
    .locals 1

    const/4 v0, 0x7

    if-gt p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0xf

    if-gt p1, v0, :cond_1

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    const/16 v0, 0x8

    :goto_0
    invoke-virtual {p1, v0}, Lp3/z;->r(I)V

    goto :goto_1

    :cond_1
    const/16 v0, 0x17

    if-gt p1, v0, :cond_2

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    const/16 v0, 0x10

    goto :goto_0

    :cond_2
    const/16 v0, 0x1f

    if-gt p1, v0, :cond_3

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    const/16 v0, 0x18

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method private u(I)V
    .locals 1

    const/16 v0, 0x87

    if-gt p1, v0, :cond_0

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    const/16 v0, 0x20

    :goto_0
    invoke-virtual {p1, v0}, Lp3/z;->r(I)V

    goto :goto_1

    :cond_0
    const/16 v0, 0x8f

    if-gt p1, v0, :cond_1

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    const/16 v0, 0x28

    goto :goto_0

    :cond_1
    const/16 v0, 0x9f

    if-gt p1, v0, :cond_2

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lp3/z;->r(I)V

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Lp3/z;->h(I)I

    move-result p1

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    mul-int/lit8 p1, p1, 0x8

    invoke-virtual {v0, p1}, Lp3/z;->r(I)V

    :cond_2
    :goto_1
    return-void
.end method

.method private v(I)V
    .locals 14

    iget-object v0, p0, Le3/c;->l:[Le3/c$b;

    aget-object v1, v0, p1

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lp3/z;->r(I)V

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {p1}, Lp3/z;->g()Z

    move-result v2

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {p1}, Lp3/z;->g()Z

    move-result v3

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {p1}, Lp3/z;->g()Z

    move-result v4

    iget-object p1, p0, Le3/c;->h:Lp3/z;

    const/4 v5, 0x3

    invoke-virtual {p1, v5}, Lp3/z;->h(I)I

    move-result p1

    iget-object v6, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v6}, Lp3/z;->g()Z

    move-result v6

    iget-object v7, p0, Le3/c;->h:Lp3/z;

    const/4 v8, 0x7

    invoke-virtual {v7, v8}, Lp3/z;->h(I)I

    move-result v7

    iget-object v8, p0, Le3/c;->h:Lp3/z;

    const/16 v9, 0x8

    invoke-virtual {v8, v9}, Lp3/z;->h(I)I

    move-result v8

    iget-object v9, p0, Le3/c;->h:Lp3/z;

    const/4 v10, 0x4

    invoke-virtual {v9, v10}, Lp3/z;->h(I)I

    move-result v11

    iget-object v9, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v9, v10}, Lp3/z;->h(I)I

    move-result v9

    iget-object v10, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v10, v0}, Lp3/z;->r(I)V

    iget-object v10, p0, Le3/c;->h:Lp3/z;

    const/4 v12, 0x6

    invoke-virtual {v10, v12}, Lp3/z;->h(I)I

    move-result v10

    iget-object v12, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v12, v0}, Lp3/z;->r(I)V

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0, v5}, Lp3/z;->h(I)I

    move-result v12

    iget-object v0, p0, Le3/c;->h:Lp3/z;

    invoke-virtual {v0, v5}, Lp3/z;->h(I)I

    move-result v13

    move v5, p1

    invoke-virtual/range {v1 .. v13}, Le3/c$b;->f(ZZZIZIIIIIII)V

    return-void
.end method

.method private w(I)V
    .locals 1

    const/16 v0, 0x7f

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x266b

    invoke-virtual {p1, v0}, Le3/c$b;->a(C)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le3/c;->m:Le3/c$b;

    and-int/lit16 p1, p1, 0xff

    int-to-char p1, p1

    invoke-virtual {v0, p1}, Le3/c$b;->a(C)V

    :goto_0
    return-void
.end method

.method private x(I)V
    .locals 1

    iget-object v0, p0, Le3/c;->m:Le3/c$b;

    and-int/lit16 p1, p1, 0xff

    int-to-char p1, p1

    invoke-virtual {v0, p1}, Le3/c$b;->a(C)V

    return-void
.end method

.method private y(I)V
    .locals 2

    const/16 v0, 0x20

    if-eq p1, v0, :cond_9

    const/16 v0, 0x21

    if-eq p1, v0, :cond_8

    const/16 v0, 0x25

    if-eq p1, v0, :cond_7

    const/16 v0, 0x2a

    if-eq p1, v0, :cond_6

    const/16 v0, 0x2c

    if-eq p1, v0, :cond_5

    const/16 v0, 0x3f

    if-eq p1, v0, :cond_4

    const/16 v0, 0x39

    if-eq p1, v0, :cond_3

    const/16 v0, 0x3a

    if-eq p1, v0, :cond_2

    const/16 v0, 0x3c

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3d

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid G2 character: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Cea708Decoder"

    invoke-static {v0, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_0
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x250c

    goto/16 :goto_0

    :pswitch_1
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x2518

    goto/16 :goto_0

    :pswitch_2
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x2500

    goto/16 :goto_0

    :pswitch_3
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x2514

    goto/16 :goto_0

    :pswitch_4
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x2510

    goto/16 :goto_0

    :pswitch_5
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x2502

    goto/16 :goto_0

    :pswitch_6
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x215e

    goto/16 :goto_0

    :pswitch_7
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x215d

    goto :goto_0

    :pswitch_8
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x215c

    goto :goto_0

    :pswitch_9
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x215b

    goto :goto_0

    :pswitch_a
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x2022

    goto :goto_0

    :pswitch_b
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x201d

    goto :goto_0

    :pswitch_c
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x201c

    goto :goto_0

    :pswitch_d
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x2019

    goto :goto_0

    :pswitch_e
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x2018

    goto :goto_0

    :pswitch_f
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x2588

    goto :goto_0

    :cond_0
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x2120

    goto :goto_0

    :cond_1
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x153

    goto :goto_0

    :cond_2
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x161

    goto :goto_0

    :cond_3
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x2122

    goto :goto_0

    :cond_4
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x178

    goto :goto_0

    :cond_5
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x152

    goto :goto_0

    :cond_6
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x160

    goto :goto_0

    :cond_7
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x2026

    goto :goto_0

    :cond_8
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0xa0

    goto :goto_0

    :cond_9
    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    :goto_0
    invoke-virtual {p1, v0}, Le3/c$b;->a(C)V

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x76
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private z(I)V
    .locals 2

    const/16 v0, 0xa0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x33c4

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid G3 character: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Cea708Decoder"

    invoke-static {v0, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Le3/c;->m:Le3/c$b;

    const/16 v0, 0x5f

    :goto_0
    invoke-virtual {p1, v0}, Le3/c$b;->a(C)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    invoke-super {p0}, Le3/e;->a()V

    return-void
.end method

.method public bridge synthetic b(J)V
    .locals 0

    invoke-super {p0, p1, p2}, Le3/e;->b(J)V

    return-void
.end method

.method protected f()Ld3/h;
    .locals 2

    iget-object v0, p0, Le3/c;->n:Ljava/util/List;

    iput-object v0, p0, Le3/c;->o:Ljava/util/List;

    new-instance v1, Le3/f;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {v1, v0}, Le3/f;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method public flush()V
    .locals 3

    invoke-super {p0}, Le3/e;->flush()V

    const/4 v0, 0x0

    iput-object v0, p0, Le3/c;->n:Ljava/util/List;

    iput-object v0, p0, Le3/c;->o:Ljava/util/List;

    const/4 v1, 0x0

    iput v1, p0, Le3/c;->q:I

    iget-object v2, p0, Le3/c;->l:[Le3/c$b;

    aget-object v1, v2, v1

    iput-object v1, p0, Le3/c;->m:Le3/c$b;

    invoke-direct {p0}, Le3/c;->F()V

    iput-object v0, p0, Le3/c;->p:Le3/c$c;

    return-void
.end method

.method protected g(Ld3/l;)V
    .locals 8

    iget-object p1, p1, Lv1/g;->l:Ljava/nio/ByteBuffer;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    iget-object v1, p0, Le3/c;->g:Lp3/a0;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p1

    invoke-virtual {v1, v0, p1}, Lp3/a0;->R([BI)V

    :cond_0
    :goto_0
    iget-object p1, p0, Le3/c;->g:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->a()I

    move-result p1

    const/4 v0, 0x3

    if-lt p1, v0, :cond_9

    iget-object p1, p0, Le3/c;->g:Lp3/a0;

    invoke-virtual {p1}, Lp3/a0;->G()I

    move-result p1

    and-int/lit8 p1, p1, 0x7

    and-int/lit8 v1, p1, 0x3

    const/4 v2, 0x4

    and-int/2addr p1, v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne p1, v2, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iget-object v5, p0, Le3/c;->g:Lp3/a0;

    invoke-virtual {v5}, Lp3/a0;->G()I

    move-result v5

    int-to-byte v5, v5

    iget-object v6, p0, Le3/c;->g:Lp3/a0;

    invoke-virtual {v6}, Lp3/a0;->G()I

    move-result v6

    int-to-byte v6, v6

    const/4 v7, 0x2

    if-eq v1, v7, :cond_2

    if-eq v1, v0, :cond_2

    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const-string p1, "Cea708Decoder"

    if-ne v1, v0, :cond_6

    invoke-direct {p0}, Le3/c;->p()V

    and-int/lit16 v0, v5, 0xc0

    shr-int/lit8 v0, v0, 0x6

    iget v1, p0, Le3/c;->i:I

    const/4 v3, -0x1

    if-eq v1, v3, :cond_4

    add-int/lit8 v1, v1, 0x1

    rem-int/2addr v1, v2

    if-eq v0, v1, :cond_4

    invoke-direct {p0}, Le3/c;->F()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sequence number discontinuity. previous="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le3/c;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " current="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iput v0, p0, Le3/c;->i:I

    and-int/lit8 p1, v5, 0x3f

    if-nez p1, :cond_5

    const/16 p1, 0x40

    :cond_5
    new-instance v1, Le3/c$c;

    invoke-direct {v1, v0, p1}, Le3/c$c;-><init>(II)V

    iput-object v1, p0, Le3/c;->p:Le3/c$c;

    iget-object p1, v1, Le3/c$c;->c:[B

    iget v0, v1, Le3/c$c;->d:I

    add-int/lit8 v2, v0, 0x1

    iput v2, v1, Le3/c$c;->d:I

    aput-byte v6, p1, v0

    goto :goto_2

    :cond_6
    if-ne v1, v7, :cond_7

    const/4 v3, 0x1

    :cond_7
    invoke-static {v3}, Lp3/a;->a(Z)V

    iget-object v0, p0, Le3/c;->p:Le3/c$c;

    if-nez v0, :cond_8

    const-string v0, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START"

    invoke-static {p1, v0}, Lp3/r;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_8
    iget-object p1, v0, Le3/c$c;->c:[B

    iget v1, v0, Le3/c$c;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, v0, Le3/c$c;->d:I

    aput-byte v5, p1, v1

    add-int/lit8 v1, v2, 0x1

    iput v1, v0, Le3/c$c;->d:I

    aput-byte v6, p1, v2

    :goto_2
    iget-object p1, p0, Le3/c;->p:Le3/c$c;

    iget v0, p1, Le3/c$c;->d:I

    iget p1, p1, Le3/c$c;->b:I

    mul-int/lit8 p1, p1, 0x2

    sub-int/2addr p1, v4

    if-ne v0, p1, :cond_0

    invoke-direct {p0}, Le3/c;->p()V

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method public bridge synthetic h()Ld3/l;
    .locals 1

    invoke-super {p0}, Le3/e;->h()Ld3/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic i()Ld3/m;
    .locals 1

    invoke-super {p0}, Le3/e;->i()Ld3/m;

    move-result-object v0

    return-object v0
.end method

.method protected l()Z
    .locals 2

    iget-object v0, p0, Le3/c;->n:Ljava/util/List;

    iget-object v1, p0, Le3/c;->o:Ljava/util/List;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic m(Ld3/l;)V
    .locals 0

    invoke-super {p0, p1}, Le3/e;->m(Ld3/l;)V

    return-void
.end method
