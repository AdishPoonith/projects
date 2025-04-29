.class public Ls1/v1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/v1$d$a;
    }
.end annotation


# static fields
.field public static final o:Ls1/v1$d;

.field private static final p:Ljava/lang/String;

.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field public static final u:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/v1$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final j:J

.field public final k:J

.field public final l:Z

.field public final m:Z

.field public final n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls1/v1$d$a;

    invoke-direct {v0}, Ls1/v1$d$a;-><init>()V

    invoke-virtual {v0}, Ls1/v1$d$a;->f()Ls1/v1$d;

    move-result-object v0

    sput-object v0, Ls1/v1$d;->o:Ls1/v1$d;

    const/4 v0, 0x0

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/v1$d;->p:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/v1$d;->q:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/v1$d;->r:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/v1$d;->s:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/v1$d;->t:Ljava/lang/String;

    sget-object v0, Ls1/w1;->a:Ls1/w1;

    sput-object v0, Ls1/v1$d;->u:Ls1/h$a;

    return-void
.end method

.method private constructor <init>(Ls1/v1$d$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ls1/v1$d$a;->a(Ls1/v1$d$a;)J

    move-result-wide v0

    iput-wide v0, p0, Ls1/v1$d;->j:J

    invoke-static {p1}, Ls1/v1$d$a;->b(Ls1/v1$d$a;)J

    move-result-wide v0

    iput-wide v0, p0, Ls1/v1$d;->k:J

    invoke-static {p1}, Ls1/v1$d$a;->c(Ls1/v1$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ls1/v1$d;->l:Z

    invoke-static {p1}, Ls1/v1$d$a;->d(Ls1/v1$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ls1/v1$d;->m:Z

    invoke-static {p1}, Ls1/v1$d$a;->e(Ls1/v1$d$a;)Z

    move-result p1

    iput-boolean p1, p0, Ls1/v1$d;->n:Z

    return-void
.end method

.method synthetic constructor <init>(Ls1/v1$d$a;Ls1/v1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/v1$d;-><init>(Ls1/v1$d$a;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/v1$e;
    .locals 0

    invoke-static {p0}, Ls1/v1$d;->c(Landroid/os/Bundle;)Ls1/v1$e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c(Landroid/os/Bundle;)Ls1/v1$e;
    .locals 5

    new-instance v0, Ls1/v1$d$a;

    invoke-direct {v0}, Ls1/v1$d$a;-><init>()V

    sget-object v1, Ls1/v1$d;->p:Ljava/lang/String;

    sget-object v2, Ls1/v1$d;->o:Ls1/v1$d;

    iget-wide v3, v2, Ls1/v1$d;->j:J

    invoke-virtual {p0, v1, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ls1/v1$d$a;->k(J)Ls1/v1$d$a;

    move-result-object v0

    sget-object v1, Ls1/v1$d;->q:Ljava/lang/String;

    iget-wide v3, v2, Ls1/v1$d;->k:J

    invoke-virtual {p0, v1, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ls1/v1$d$a;->h(J)Ls1/v1$d$a;

    move-result-object v0

    sget-object v1, Ls1/v1$d;->r:Ljava/lang/String;

    iget-boolean v3, v2, Ls1/v1$d;->l:Z

    invoke-virtual {p0, v1, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Ls1/v1$d$a;->j(Z)Ls1/v1$d$a;

    move-result-object v0

    sget-object v1, Ls1/v1$d;->s:Ljava/lang/String;

    iget-boolean v3, v2, Ls1/v1$d;->m:Z

    invoke-virtual {p0, v1, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Ls1/v1$d$a;->i(Z)Ls1/v1$d$a;

    move-result-object v0

    sget-object v1, Ls1/v1$d;->t:Ljava/lang/String;

    iget-boolean v2, v2, Ls1/v1$d;->n:Z

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    invoke-virtual {v0, p0}, Ls1/v1$d$a;->l(Z)Ls1/v1$d$a;

    move-result-object p0

    invoke-virtual {p0}, Ls1/v1$d$a;->g()Ls1/v1$e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ls1/v1$d$a;
    .locals 2

    new-instance v0, Ls1/v1$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls1/v1$d$a;-><init>(Ls1/v1$d;Ls1/v1$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls1/v1$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls1/v1$d;

    iget-wide v3, p0, Ls1/v1$d;->j:J

    iget-wide v5, p1, Ls1/v1$d;->j:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Ls1/v1$d;->k:J

    iget-wide v5, p1, Ls1/v1$d;->k:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-boolean v1, p0, Ls1/v1$d;->l:Z

    iget-boolean v3, p1, Ls1/v1$d;->l:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ls1/v1$d;->m:Z

    iget-boolean v3, p1, Ls1/v1$d;->m:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ls1/v1$d;->n:Z

    iget-boolean p1, p1, Ls1/v1$d;->n:Z

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 7

    iget-wide v0, p0, Ls1/v1$d;->j:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Ls1/v1$d;->k:J

    ushr-long v5, v3, v2

    xor-long v2, v3, v5

    long-to-int v0, v2

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Ls1/v1$d;->l:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Ls1/v1$d;->m:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Ls1/v1$d;->n:Z

    add-int/2addr v1, v0

    return v1
.end method
