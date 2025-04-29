.class public final Lu1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu1/e$c;,
        Lu1/e$b;,
        Lu1/e$e;,
        Lu1/e$d;
    }
.end annotation


# static fields
.field public static final p:Lu1/e;

.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field private static final u:Ljava/lang/String;

.field public static final v:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Lu1/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:I

.field private o:Lu1/e$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu1/e$e;

    invoke-direct {v0}, Lu1/e$e;-><init>()V

    invoke-virtual {v0}, Lu1/e$e;->a()Lu1/e;

    move-result-object v0

    sput-object v0, Lu1/e;->p:Lu1/e;

    const/4 v0, 0x0

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu1/e;->q:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu1/e;->r:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu1/e;->s:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu1/e;->t:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu1/e;->u:Ljava/lang/String;

    sget-object v0, Lu1/d;->a:Lu1/d;

    sput-object v0, Lu1/e;->v:Ls1/h$a;

    return-void
.end method

.method private constructor <init>(IIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu1/e;->j:I

    iput p2, p0, Lu1/e;->k:I

    iput p3, p0, Lu1/e;->l:I

    iput p4, p0, Lu1/e;->m:I

    iput p5, p0, Lu1/e;->n:I

    return-void
.end method

.method synthetic constructor <init>(IIIIILu1/e$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lu1/e;-><init>(IIIII)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lu1/e;
    .locals 0

    invoke-static {p0}, Lu1/e;->c(Landroid/os/Bundle;)Lu1/e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c(Landroid/os/Bundle;)Lu1/e;
    .locals 3

    new-instance v0, Lu1/e$e;

    invoke-direct {v0}, Lu1/e$e;-><init>()V

    sget-object v1, Lu1/e;->q:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lu1/e$e;->c(I)Lu1/e$e;

    :cond_0
    sget-object v1, Lu1/e;->r:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lu1/e$e;->d(I)Lu1/e$e;

    :cond_1
    sget-object v1, Lu1/e;->s:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lu1/e$e;->f(I)Lu1/e$e;

    :cond_2
    sget-object v1, Lu1/e;->t:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lu1/e$e;->b(I)Lu1/e$e;

    :cond_3
    sget-object v1, Lu1/e;->u:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v0, p0}, Lu1/e$e;->e(I)Lu1/e$e;

    :cond_4
    invoke-virtual {v0}, Lu1/e$e;->a()Lu1/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Lu1/e$d;
    .locals 2

    iget-object v0, p0, Lu1/e;->o:Lu1/e$d;

    if-nez v0, :cond_0

    new-instance v0, Lu1/e$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lu1/e$d;-><init>(Lu1/e;Lu1/e$a;)V

    iput-object v0, p0, Lu1/e;->o:Lu1/e$d;

    :cond_0
    iget-object v0, p0, Lu1/e;->o:Lu1/e$d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lu1/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lu1/e;

    iget v2, p0, Lu1/e;->j:I

    iget v3, p1, Lu1/e;->j:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lu1/e;->k:I

    iget v3, p1, Lu1/e;->k:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lu1/e;->l:I

    iget v3, p1, Lu1/e;->l:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lu1/e;->m:I

    iget v3, p1, Lu1/e;->m:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lu1/e;->n:I

    iget p1, p1, Lu1/e;->n:I

    if-ne v2, p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lu1/e;->j:I

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu1/e;->k:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu1/e;->l:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu1/e;->m:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu1/e;->n:I

    add-int/2addr v1, v0

    return v1
.end method
