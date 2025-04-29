.class Lz2/p$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# static fields
.field private static final g:Ls1/n1;

.field private static final h:Ls1/n1;


# instance fields
.field private final a:Lm2/b;

.field private final b:Lx1/e0;

.field private final c:Ls1/n1;

.field private d:Ls1/n1;

.field private e:[B

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls1/n1$b;

    invoke-direct {v0}, Ls1/n1$b;-><init>()V

    const-string v1, "application/id3"

    invoke-virtual {v0, v1}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object v0

    sput-object v0, Lz2/p$c;->g:Ls1/n1;

    new-instance v0, Ls1/n1$b;

    invoke-direct {v0}, Ls1/n1$b;-><init>()V

    const-string v1, "application/x-emsg"

    invoke-virtual {v0, v1}, Ls1/n1$b;->g0(Ljava/lang/String;)Ls1/n1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls1/n1$b;->G()Ls1/n1;

    move-result-object v0

    sput-object v0, Lz2/p$c;->h:Ls1/n1;

    return-void
.end method

.method public constructor <init>(Lx1/e0;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm2/b;

    invoke-direct {v0}, Lm2/b;-><init>()V

    iput-object v0, p0, Lz2/p$c;->a:Lm2/b;

    iput-object p1, p0, Lz2/p$c;->b:Lx1/e0;

    const/4 p1, 0x1

    if-eq p2, p1, :cond_1

    const/4 p1, 0x3

    if-ne p2, p1, :cond_0

    sget-object p1, Lz2/p$c;->h:Ls1/n1;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown metadataType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object p1, Lz2/p$c;->g:Ls1/n1;

    :goto_0
    iput-object p1, p0, Lz2/p$c;->c:Ls1/n1;

    const/4 p1, 0x0

    new-array p2, p1, [B

    iput-object p2, p0, Lz2/p$c;->e:[B

    iput p1, p0, Lz2/p$c;->f:I

    return-void
.end method

.method private g(Lm2/a;)Z
    .locals 1

    invoke-virtual {p1}, Lm2/a;->n()Ls1/n1;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lz2/p$c;->c:Ls1/n1;

    iget-object v0, v0, Ls1/n1;->u:Ljava/lang/String;

    iget-object p1, p1, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v0, p1}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private h(I)V
    .locals 2

    iget-object v0, p0, Lz2/p$c;->e:[B

    array-length v1, v0

    if-ge v1, p1, :cond_0

    div-int/lit8 v1, p1, 0x2

    add-int/2addr p1, v1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lz2/p$c;->e:[B

    :cond_0
    return-void
.end method

.method private i(II)Lp3/a0;
    .locals 3

    iget v0, p0, Lz2/p$c;->f:I

    sub-int/2addr v0, p2

    sub-int p1, v0, p1

    iget-object v1, p0, Lz2/p$c;->e:[B

    invoke-static {v1, p1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    new-instance v1, Lp3/a0;

    invoke-direct {v1, p1}, Lp3/a0;-><init>([B)V

    iget-object p1, p0, Lz2/p$c;->e:[B

    const/4 v2, 0x0

    invoke-static {p1, v0, p1, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p2, p0, Lz2/p$c;->f:I

    return-object v1
.end method


# virtual methods
.method public a(Lo3/i;IZI)I
    .locals 1

    iget p4, p0, Lz2/p$c;->f:I

    add-int/2addr p4, p2

    invoke-direct {p0, p4}, Lz2/p$c;->h(I)V

    iget-object p4, p0, Lz2/p$c;->e:[B

    iget v0, p0, Lz2/p$c;->f:I

    invoke-interface {p1, p4, v0, p2}, Lo3/i;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-eqz p3, :cond_0

    return p2

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    iget p2, p0, Lz2/p$c;->f:I

    add-int/2addr p2, p1

    iput p2, p0, Lz2/p$c;->f:I

    return p1
.end method

.method public b(Lp3/a0;II)V
    .locals 1

    iget p3, p0, Lz2/p$c;->f:I

    add-int/2addr p3, p2

    invoke-direct {p0, p3}, Lz2/p$c;->h(I)V

    iget-object p3, p0, Lz2/p$c;->e:[B

    iget v0, p0, Lz2/p$c;->f:I

    invoke-virtual {p1, p3, v0, p2}, Lp3/a0;->l([BII)V

    iget p1, p0, Lz2/p$c;->f:I

    add-int/2addr p1, p2

    iput p1, p0, Lz2/p$c;->f:I

    return-void
.end method

.method public c(JIIILx1/e0$a;)V
    .locals 7

    iget-object v0, p0, Lz2/p$c;->d:Ls1/n1;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p4, p5}, Lz2/p$c;->i(II)Lp3/a0;

    move-result-object p4

    iget-object v0, p0, Lz2/p$c;->d:Ls1/n1;

    iget-object v0, v0, Ls1/n1;->u:Ljava/lang/String;

    iget-object v1, p0, Lz2/p$c;->c:Ls1/n1;

    iget-object v1, v1, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {v0, v1}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz2/p$c;->d:Ls1/n1;

    iget-object v0, v0, Ls1/n1;->u:Ljava/lang/String;

    const-string v1, "application/x-emsg"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "HlsSampleStreamWrapper"

    if-eqz v0, :cond_2

    iget-object v0, p0, Lz2/p$c;->a:Lm2/b;

    invoke-virtual {v0, p4}, Lm2/b;->c(Lp3/a0;)Lm2/a;

    move-result-object p4

    invoke-direct {p0, p4}, Lz2/p$c;->g(Lm2/a;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    iget-object p3, p0, Lz2/p$c;->c:Ls1/n1;

    iget-object p3, p3, Ls1/n1;->u:Ljava/lang/String;

    aput-object p3, p1, p2

    const/4 p2, 0x1

    invoke-virtual {p4}, Lm2/a;->n()Ls1/n1;

    move-result-object p3

    aput-object p3, p1, p2

    const-string p2, "Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, Lp3/a0;

    invoke-virtual {p4}, Lm2/a;->w()[B

    move-result-object p4

    invoke-static {p4}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [B

    invoke-direct {v0, p4}, Lp3/a0;-><init>([B)V

    move-object p4, v0

    :goto_0
    invoke-virtual {p4}, Lp3/a0;->a()I

    move-result v4

    iget-object v0, p0, Lz2/p$c;->b:Lx1/e0;

    invoke-interface {v0, p4, v4}, Lx1/e0;->d(Lp3/a0;I)V

    iget-object v0, p0, Lz2/p$c;->b:Lx1/e0;

    move-wide v1, p1

    move v3, p3

    move v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lx1/e0;->c(JIIILx1/e0$a;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Ignoring sample for unsupported format: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lz2/p$c;->d:Ls1/n1;

    iget-object p2, p2, Ls1/n1;->u:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic d(Lp3/a0;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/d0;->b(Lx1/e0;Lp3/a0;I)V

    return-void
.end method

.method public e(Ls1/n1;)V
    .locals 1

    iput-object p1, p0, Lz2/p$c;->d:Ls1/n1;

    iget-object p1, p0, Lz2/p$c;->b:Lx1/e0;

    iget-object v0, p0, Lz2/p$c;->c:Ls1/n1;

    invoke-interface {p1, v0}, Lx1/e0;->e(Ls1/n1;)V

    return-void
.end method

.method public synthetic f(Lo3/i;IZ)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lx1/d0;->a(Lx1/e0;Lo3/i;IZ)I

    move-result p1

    return p1
.end method
