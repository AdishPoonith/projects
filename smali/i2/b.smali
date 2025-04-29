.class public final Li2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li2/b$a;,
        Li2/b$c;,
        Li2/b$b;
    }
.end annotation


# static fields
.field public static final h:Lx1/r;


# instance fields
.field private a:Lx1/n;

.field private b:Lx1/e0;

.field private c:I

.field private d:J

.field private e:Li2/b$b;

.field private f:I

.field private g:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Li2/a;->b:Li2/a;

    sput-object v0, Li2/b;->h:Lx1/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Li2/b;->c:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Li2/b;->d:J

    const/4 v2, -0x1

    iput v2, p0, Li2/b;->f:I

    iput-wide v0, p0, Li2/b;->g:J

    return-void
.end method

.method public static synthetic d()[Lx1/l;
    .locals 1

    invoke-static {}, Li2/b;->f()[Lx1/l;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 1

    iget-object v0, p0, Li2/b;->b:Lx1/e0;

    invoke-static {v0}, Lp3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Li2/b;->a:Lx1/n;

    invoke-static {v0}, Lp3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static synthetic f()[Lx1/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lx1/l;

    new-instance v1, Li2/b;

    invoke-direct {v1}, Li2/b;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private g(Lx1/m;)V
    .locals 6

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v0

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget v0, p0, Li2/b;->f:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-interface {p1, v0}, Lx1/m;->g(I)V

    const/4 p1, 0x4

    iput p1, p0, Li2/b;->c:I

    return-void

    :cond_1
    invoke-static {p1}, Li2/d;->a(Lx1/m;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lx1/m;->l()J

    move-result-wide v0

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v3

    sub-long/2addr v0, v3

    long-to-int v1, v0

    invoke-interface {p1, v1}, Lx1/m;->g(I)V

    iput v2, p0, Li2/b;->c:I

    return-void

    :cond_2
    const/4 p1, 0x0

    const-string v0, "Unsupported or unrecognized wav file type."

    invoke-static {v0, p1}, Ls1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls1/u2;

    move-result-object p1

    throw p1
.end method

.method private h(Lx1/m;)V
    .locals 6

    invoke-static {p1}, Li2/d;->b(Lx1/m;)Li2/c;

    move-result-object v3

    iget p1, v3, Li2/c;->a:I

    const/16 v0, 0x11

    if-ne p1, v0, :cond_0

    new-instance p1, Li2/b$a;

    iget-object v0, p0, Li2/b;->a:Lx1/n;

    iget-object v1, p0, Li2/b;->b:Lx1/e0;

    invoke-direct {p1, v0, v1, v3}, Li2/b$a;-><init>(Lx1/n;Lx1/e0;Li2/c;)V

    :goto_0
    iput-object p1, p0, Li2/b;->e:Li2/b$b;

    goto :goto_1

    :cond_0
    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    new-instance p1, Li2/b$c;

    iget-object v1, p0, Li2/b;->a:Lx1/n;

    iget-object v2, p0, Li2/b;->b:Lx1/e0;

    const/4 v5, -0x1

    const-string v4, "audio/g711-alaw"

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Li2/b$c;-><init>(Lx1/n;Lx1/e0;Li2/c;Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x7

    if-ne p1, v0, :cond_2

    new-instance p1, Li2/b$c;

    iget-object v1, p0, Li2/b;->a:Lx1/n;

    iget-object v2, p0, Li2/b;->b:Lx1/e0;

    const/4 v5, -0x1

    const-string v4, "audio/g711-mlaw"

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Li2/b$c;-><init>(Lx1/n;Lx1/e0;Li2/c;Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    iget v0, v3, Li2/c;->f:I

    invoke-static {p1, v0}, Lu1/o0;->a(II)I

    move-result v5

    if-eqz v5, :cond_3

    new-instance p1, Li2/b$c;

    iget-object v1, p0, Li2/b;->a:Lx1/n;

    iget-object v2, p0, Li2/b;->b:Lx1/e0;

    const-string v4, "audio/raw"

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Li2/b$c;-><init>(Lx1/n;Lx1/e0;Li2/c;Ljava/lang/String;I)V

    goto :goto_0

    :goto_1
    const/4 p1, 0x3

    iput p1, p0, Li2/b;->c:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported WAV format type: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v3, Li2/c;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ls1/u2;->d(Ljava/lang/String;)Ls1/u2;

    move-result-object p1

    throw p1
.end method

.method private k(Lx1/m;)V
    .locals 2

    invoke-static {p1}, Li2/d;->c(Lx1/m;)J

    move-result-wide v0

    iput-wide v0, p0, Li2/b;->d:J

    const/4 p1, 0x2

    iput p1, p0, Li2/b;->c:I

    return-void
.end method

.method private l(Lx1/m;)I
    .locals 6

    iget-wide v0, p0, Li2/b;->g:J

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-wide v0, p0, Li2/b;->g:J

    invoke-interface {p1}, Lx1/m;->p()J

    move-result-wide v3

    sub-long/2addr v0, v3

    iget-object v3, p0, Li2/b;->e:Li2/b$b;

    invoke-static {v3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/b$b;

    invoke-interface {v3, p1, v0, v1}, Li2/b$b;->a(Lx1/m;J)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v2, -0x1

    :cond_1
    return v2
.end method

.method private m(Lx1/m;)V
    .locals 9

    invoke-static {p1}, Li2/d;->e(Lx1/m;)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    iput v1, p0, Li2/b;->f:I

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-wide v2, p0, Li2/b;->d:J

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    const-wide v6, 0xffffffffL

    cmp-long v8, v0, v6

    if-nez v8, :cond_0

    move-wide v0, v2

    :cond_0
    iget v2, p0, Li2/b;->f:I

    int-to-long v2, v2

    add-long/2addr v2, v0

    iput-wide v2, p0, Li2/b;->g:J

    invoke-interface {p1}, Lx1/m;->a()J

    move-result-wide v0

    cmp-long p1, v0, v4

    if-eqz p1, :cond_1

    iget-wide v2, p0, Li2/b;->g:J

    cmp-long p1, v2, v0

    if-lez p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Data exceeds input length: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Li2/b;->g:J

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "WavExtractor"

    invoke-static {v2, p1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    iput-wide v0, p0, Li2/b;->g:J

    :cond_1
    iget-object p1, p0, Li2/b;->e:Li2/b$b;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li2/b$b;

    iget v0, p0, Li2/b;->f:I

    iget-wide v1, p0, Li2/b;->g:J

    invoke-interface {p1, v0, v1, v2}, Li2/b$b;->b(IJ)V

    const/4 p1, 0x4

    iput p1, p0, Li2/b;->c:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    iput p1, p0, Li2/b;->c:I

    iget-object p1, p0, Li2/b;->e:Li2/b$b;

    if-eqz p1, :cond_1

    invoke-interface {p1, p3, p4}, Li2/b$b;->c(J)V

    :cond_1
    return-void
.end method

.method public c(Lx1/n;)V
    .locals 2

    iput-object p1, p0, Li2/b;->a:Lx1/n;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lx1/n;->d(II)Lx1/e0;

    move-result-object v0

    iput-object v0, p0, Li2/b;->b:Lx1/e0;

    invoke-interface {p1}, Lx1/n;->k()V

    return-void
.end method

.method public i(Lx1/m;Lx1/a0;)I
    .locals 2

    invoke-direct {p0}, Li2/b;->e()V

    iget p2, p0, Li2/b;->c:I

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    const/4 v1, 0x1

    if-eq p2, v1, :cond_3

    const/4 v1, 0x2

    if-eq p2, v1, :cond_2

    const/4 v1, 0x3

    if-eq p2, v1, :cond_1

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-direct {p0, p1}, Li2/b;->l(Lx1/m;)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0, p1}, Li2/b;->m(Lx1/m;)V

    return v0

    :cond_2
    invoke-direct {p0, p1}, Li2/b;->h(Lx1/m;)V

    return v0

    :cond_3
    invoke-direct {p0, p1}, Li2/b;->k(Lx1/m;)V

    return v0

    :cond_4
    invoke-direct {p0, p1}, Li2/b;->g(Lx1/m;)V

    return v0
.end method

.method public j(Lx1/m;)Z
    .locals 0

    invoke-static {p1}, Li2/d;->a(Lx1/m;)Z

    move-result p1

    return p1
.end method
