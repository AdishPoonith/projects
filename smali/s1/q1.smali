.class public final Ls1/q1;
.super Ls1/j3;
.source "SourceFile"


# static fields
.field private static final n:Ljava/lang/String;

.field private static final o:Ljava/lang/String;

.field public static final p:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/q1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final l:Z

.field private final m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/q1;->n:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/q1;->o:Ljava/lang/String;

    sget-object v0, Ls1/p1;->a:Ls1/p1;

    sput-object v0, Ls1/q1;->p:Ls1/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ls1/j3;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls1/q1;->l:Z

    iput-boolean v0, p0, Ls1/q1;->m:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ls1/j3;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls1/q1;->l:Z

    iput-boolean p1, p0, Ls1/q1;->m:Z

    return-void
.end method

.method public static synthetic c(Landroid/os/Bundle;)Ls1/q1;
    .locals 0

    invoke-static {p0}, Ls1/q1;->d(Landroid/os/Bundle;)Ls1/q1;

    move-result-object p0

    return-object p0
.end method

.method private static d(Landroid/os/Bundle;)Ls1/q1;
    .locals 3

    sget-object v0, Ls1/j3;->j:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->a(Z)V

    sget-object v0, Ls1/q1;->n:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ls1/q1;

    sget-object v2, Ls1/q1;->o:Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    invoke-direct {v0, p0}, Ls1/q1;-><init>(Z)V

    goto :goto_1

    :cond_1
    new-instance v0, Ls1/q1;

    invoke-direct {v0}, Ls1/q1;-><init>()V

    :goto_1
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ls1/q1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ls1/q1;

    iget-boolean v0, p0, Ls1/q1;->m:Z

    iget-boolean v2, p1, Ls1/q1;->m:Z

    if-ne v0, v2, :cond_1

    iget-boolean v0, p0, Ls1/q1;->l:Z

    iget-boolean p1, p1, Ls1/q1;->l:Z

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-boolean v1, p0, Ls1/q1;->l:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-boolean v1, p0, Ls1/q1;->m:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lb5/j;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
