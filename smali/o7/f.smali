.class final Lo7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo7/g;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(CLjava/lang/StringBuilder;)V
    .locals 2

    const/16 v0, 0x20

    if-lt p0, v0, :cond_0

    const/16 v0, 0x3f

    if-gt p0, v0, :cond_0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    const/16 v0, 0x40

    if-lt p0, v0, :cond_1

    const/16 v1, 0x5e

    if-gt p0, v1, :cond_1

    sub-int/2addr p0, v0

    int-to-char p0, p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :cond_1
    invoke-static {p0}, Lo7/j;->e(C)V

    return-void
.end method

.method private static c(Ljava/lang/CharSequence;I)Ljava/lang/String;
    .locals 8

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, p1

    if-eqz v0, :cond_5

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-lt v0, v3, :cond_0

    add-int/lit8 v4, p1, 0x1

    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x3

    if-lt v0, v5, :cond_1

    add-int/lit8 v6, p1, 0x2

    invoke-interface {p0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    const/4 v7, 0x4

    if-lt v0, v7, :cond_2

    add-int/2addr p1, v5

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    :cond_2
    shl-int/lit8 p0, v1, 0x12

    shl-int/lit8 p1, v4, 0xc

    add-int/2addr p0, p1

    shl-int/lit8 p1, v6, 0x6

    add-int/2addr p0, p1

    add-int/2addr p0, v2

    shr-int/lit8 p1, p0, 0x10

    and-int/lit16 p1, p1, 0xff

    int-to-char p1, p1

    shr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-char v1, v1

    and-int/lit16 p0, p0, 0xff

    int-to-char p0, p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-lt v0, v3, :cond_3

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    if-lt v0, v5, :cond_4

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "StringBuilder must not be empty"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static e(Lo7/h;Ljava/lang/CharSequence;)V
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lo7/h;->o(I)V

    return-void

    :cond_0
    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    :try_start_1
    invoke-virtual {p0}, Lo7/h;->p()V

    invoke-virtual {p0}, Lo7/h;->g()Lo7/k;

    move-result-object v4

    invoke-virtual {v4}, Lo7/k;->a()I

    move-result v4

    invoke-virtual {p0}, Lo7/h;->a()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {p0}, Lo7/h;->f()I

    move-result v5

    if-le v5, v4, :cond_1

    invoke-virtual {p0}, Lo7/h;->a()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {p0, v4}, Lo7/h;->q(I)V

    invoke-virtual {p0}, Lo7/h;->g()Lo7/k;

    move-result-object v4

    invoke-virtual {v4}, Lo7/k;->a()I

    move-result v4

    invoke-virtual {p0}, Lo7/h;->a()I

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-int/2addr v4, v6

    :cond_1
    if-gt v5, v4, :cond_2

    if-gt v4, v2, :cond_2

    invoke-virtual {p0, v0}, Lo7/h;->o(I)V

    return-void

    :cond_2
    const/4 v4, 0x4

    if-gt v1, v4, :cond_6

    sub-int/2addr v1, v3

    :try_start_2
    invoke-static {p1, v0}, Lo7/f;->c(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lo7/h;->i()Z

    move-result v4

    xor-int/2addr v4, v3

    if-eqz v4, :cond_3

    if-gt v1, v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    if-gt v1, v2, :cond_4

    invoke-virtual {p0}, Lo7/h;->a()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {p0, v2}, Lo7/h;->q(I)V

    invoke-virtual {p0}, Lo7/h;->g()Lo7/k;

    move-result-object v2

    invoke-virtual {v2}, Lo7/k;->a()I

    move-result v2

    invoke-virtual {p0}, Lo7/h;->a()I

    move-result v4

    sub-int/2addr v2, v4

    const/4 v4, 0x3

    if-lt v2, v4, :cond_4

    invoke-virtual {p0}, Lo7/h;->a()I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {p0, v2}, Lo7/h;->q(I)V

    const/4 v3, 0x0

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lo7/h;->k()V

    iget p1, p0, Lo7/h;->f:I

    sub-int/2addr p1, v1

    iput p1, p0, Lo7/h;->f:I

    goto :goto_1

    :cond_5
    invoke-virtual {p0, p1}, Lo7/h;->s(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    invoke-virtual {p0, v0}, Lo7/h;->o(I)V

    return-void

    :cond_6
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Count must not exceed 4"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v0}, Lo7/h;->o(I)V

    throw p1
.end method


# virtual methods
.method public a(Lo7/h;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :cond_0
    invoke-virtual {p1}, Lo7/h;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lo7/h;->c()C

    move-result v1

    invoke-static {v1, v0}, Lo7/f;->b(CLjava/lang/StringBuilder;)V

    iget v1, p1, Lo7/h;->f:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p1, Lo7/h;->f:I

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/4 v2, 0x4

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo7/f;->c(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lo7/h;->s(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lo7/h;->d()Ljava/lang/String;

    move-result-object v2

    iget v3, p1, Lo7/h;->f:I

    invoke-virtual {p0}, Lo7/f;->d()I

    move-result v4

    invoke-static {v2, v3, v4}, Lo7/j;->n(Ljava/lang/CharSequence;II)I

    move-result v2

    invoke-virtual {p0}, Lo7/f;->d()I

    move-result v3

    if-eq v2, v3, :cond_0

    invoke-virtual {p1, v1}, Lo7/h;->o(I)V

    :cond_1
    const/16 v1, 0x1f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p1, v0}, Lo7/f;->e(Lo7/h;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public d()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method
