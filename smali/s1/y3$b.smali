.class public final Ls1/y3$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/y3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field private static final u:Ljava/lang/String;

.field public static final v:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/y3$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:I

.field public m:J

.field public n:J

.field public o:Z

.field private p:Lv2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$b;->q:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$b;->r:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$b;->s:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$b;->t:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/y3$b;->u:Ljava/lang/String;

    sget-object v0, Ls1/z3;->a:Ls1/z3;

    sput-object v0, Ls1/y3$b;->v:Ls1/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lv2/c;->p:Lv2/c;

    iput-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/y3$b;
    .locals 0

    invoke-static {p0}, Ls1/y3$b;->c(Landroid/os/Bundle;)Ls1/y3$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Ls1/y3$b;)Lv2/c;
    .locals 0

    iget-object p0, p0, Ls1/y3$b;->p:Lv2/c;

    return-object p0
.end method

.method private static c(Landroid/os/Bundle;)Ls1/y3$b;
    .locals 12

    sget-object v0, Ls1/y3$b;->q:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    sget-object v0, Ls1/y3$b;->r:Ljava/lang/String;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {p0, v0, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    sget-object v0, Ls1/y3$b;->s:Ljava/lang/String;

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v0, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    sget-object v0, Ls1/y3$b;->t:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v11

    sget-object v0, Ls1/y3$b;->u:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lv2/c;->v:Ls1/h$a;

    invoke-interface {v0, p0}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object p0

    check-cast p0, Lv2/c;

    goto :goto_0

    :cond_0
    sget-object p0, Lv2/c;->p:Lv2/c;

    :goto_0
    move-object v10, p0

    new-instance p0, Ls1/y3$b;

    invoke-direct {p0}, Ls1/y3$b;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-virtual/range {v2 .. v11}, Ls1/y3$b;->v(Ljava/lang/Object;Ljava/lang/Object;IJJLv2/c;Z)Ls1/y3$b;

    return-object p0
.end method


# virtual methods
.method public d(I)I
    .locals 1

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    invoke-virtual {v0, p1}, Lv2/c;->c(I)Lv2/c$a;

    move-result-object p1

    iget p1, p1, Lv2/c$a;->k:I

    return p1
.end method

.method public e(II)J
    .locals 2

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    invoke-virtual {v0, p1}, Lv2/c;->c(I)Lv2/c$a;

    move-result-object p1

    iget v0, p1, Lv2/c$a;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object p1, p1, Lv2/c$a;->o:[J

    aget-wide v0, p1, p2

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls1/y3$b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ls1/y3$b;

    iget-object v2, p0, Ls1/y3$b;->j:Ljava/lang/Object;

    iget-object v3, p1, Ls1/y3$b;->j:Ljava/lang/Object;

    invoke-static {v2, v3}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/y3$b;->k:Ljava/lang/Object;

    iget-object v3, p1, Ls1/y3$b;->k:Ljava/lang/Object;

    invoke-static {v2, v3}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ls1/y3$b;->l:I

    iget v3, p1, Ls1/y3$b;->l:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ls1/y3$b;->m:J

    iget-wide v4, p1, Ls1/y3$b;->m:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ls1/y3$b;->n:J

    iget-wide v4, p1, Ls1/y3$b;->n:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-boolean v2, p0, Ls1/y3$b;->o:Z

    iget-boolean v3, p1, Ls1/y3$b;->o:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ls1/y3$b;->p:Lv2/c;

    iget-object p1, p1, Ls1/y3$b;->p:Lv2/c;

    invoke-static {v2, p1}, Lp3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    iget v0, v0, Lv2/c;->k:I

    return v0
.end method

.method public g(J)I
    .locals 3

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    iget-wide v1, p0, Ls1/y3$b;->m:J

    invoke-virtual {v0, p1, p2, v1, v2}, Lv2/c;->d(JJ)I

    move-result p1

    return p1
.end method

.method public h(J)I
    .locals 3

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    iget-wide v1, p0, Ls1/y3$b;->m:J

    invoke-virtual {v0, p1, p2, v1, v2}, Lv2/c;->e(JJ)I

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Ls1/y3$b;->j:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0xd9

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Ls1/y3$b;->k:Ljava/lang/Object;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget v0, p0, Ls1/y3$b;->l:I

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-wide v0, p0, Ls1/y3$b;->m:J

    const/16 v3, 0x20

    ushr-long v4, v0, v3

    xor-long/2addr v0, v4

    long-to-int v1, v0

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-wide v0, p0, Ls1/y3$b;->n:J

    ushr-long v3, v0, v3

    xor-long/2addr v0, v3

    long-to-int v1, v0

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-boolean v0, p0, Ls1/y3$b;->o:Z

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    invoke-virtual {v0}, Lv2/c;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    return v2
.end method

.method public i(I)J
    .locals 2

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    invoke-virtual {v0, p1}, Lv2/c;->c(I)Lv2/c$a;

    move-result-object p1

    iget-wide v0, p1, Lv2/c$a;->j:J

    return-wide v0
.end method

.method public j()J
    .locals 2

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    iget-wide v0, v0, Lv2/c;->l:J

    return-wide v0
.end method

.method public k(II)I
    .locals 2

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    invoke-virtual {v0, p1}, Lv2/c;->c(I)Lv2/c$a;

    move-result-object p1

    iget v0, p1, Lv2/c$a;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object p1, p1, Lv2/c$a;->n:[I

    aget p1, p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public l(I)J
    .locals 2

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    invoke-virtual {v0, p1}, Lv2/c;->c(I)Lv2/c$a;

    move-result-object p1

    iget-wide v0, p1, Lv2/c$a;->p:J

    return-wide v0
.end method

.method public m()J
    .locals 2

    iget-wide v0, p0, Ls1/y3$b;->m:J

    return-wide v0
.end method

.method public n(I)I
    .locals 1

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    invoke-virtual {v0, p1}, Lv2/c;->c(I)Lv2/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lv2/c$a;->e()I

    move-result p1

    return p1
.end method

.method public o(II)I
    .locals 1

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    invoke-virtual {v0, p1}, Lv2/c;->c(I)Lv2/c$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lv2/c$a;->f(I)I

    move-result p1

    return p1
.end method

.method public p()J
    .locals 2

    iget-wide v0, p0, Ls1/y3$b;->n:J

    invoke-static {v0, v1}, Lp3/n0;->Y0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public q()J
    .locals 2

    iget-wide v0, p0, Ls1/y3$b;->n:J

    return-wide v0
.end method

.method public r()I
    .locals 1

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    iget v0, v0, Lv2/c;->n:I

    return v0
.end method

.method public s(I)Z
    .locals 1

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    invoke-virtual {v0, p1}, Lv2/c;->c(I)Lv2/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lv2/c$a;->g()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public t(I)Z
    .locals 1

    iget-object v0, p0, Ls1/y3$b;->p:Lv2/c;

    invoke-virtual {v0, p1}, Lv2/c;->c(I)Lv2/c$a;

    move-result-object p1

    iget-boolean p1, p1, Lv2/c$a;->q:Z

    return p1
.end method

.method public u(Ljava/lang/Object;Ljava/lang/Object;IJJ)Ls1/y3$b;
    .locals 10

    sget-object v8, Lv2/c;->p:Lv2/c;

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    move-wide/from16 v6, p6

    invoke-virtual/range {v0 .. v9}, Ls1/y3$b;->v(Ljava/lang/Object;Ljava/lang/Object;IJJLv2/c;Z)Ls1/y3$b;

    move-result-object v0

    return-object v0
.end method

.method public v(Ljava/lang/Object;Ljava/lang/Object;IJJLv2/c;Z)Ls1/y3$b;
    .locals 0

    iput-object p1, p0, Ls1/y3$b;->j:Ljava/lang/Object;

    iput-object p2, p0, Ls1/y3$b;->k:Ljava/lang/Object;

    iput p3, p0, Ls1/y3$b;->l:I

    iput-wide p4, p0, Ls1/y3$b;->m:J

    iput-wide p6, p0, Ls1/y3$b;->n:J

    iput-object p8, p0, Ls1/y3$b;->p:Lv2/c;

    iput-boolean p9, p0, Ls1/y3$b;->o:Z

    return-object p0
.end method
