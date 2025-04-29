.class public final Lu2/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/h;


# static fields
.field private static final o:Ljava/lang/String;

.field private static final p:Ljava/lang/String;

.field public static final q:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Lu2/t0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final j:I

.field public final k:Ljava/lang/String;

.field public final l:I

.field private final m:[Ls1/n1;

.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu2/t0;->o:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu2/t0;->p:Ljava/lang/String;

    sget-object v0, Lu2/s0;->a:Lu2/s0;

    sput-object v0, Lu2/t0;->q:Ls1/h$a;

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;[Ls1/n1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p2

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->a(Z)V

    iput-object p1, p0, Lu2/t0;->k:Ljava/lang/String;

    iput-object p2, p0, Lu2/t0;->m:[Ls1/n1;

    array-length p1, p2

    iput p1, p0, Lu2/t0;->j:I

    aget-object p1, p2, v1

    iget-object p1, p1, Ls1/n1;->u:Ljava/lang/String;

    invoke-static {p1}, Lp3/v;->k(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    aget-object p1, p2, v1

    iget-object p1, p1, Ls1/n1;->t:Ljava/lang/String;

    invoke-static {p1}, Lp3/v;->k(Ljava/lang/String;)I

    move-result p1

    :cond_1
    iput p1, p0, Lu2/t0;->l:I

    invoke-direct {p0}, Lu2/t0;->h()V

    return-void
.end method

.method public varargs constructor <init>([Ls1/n1;)V
    .locals 1

    const-string v0, ""

    invoke-direct {p0, v0, p1}, Lu2/t0;-><init>(Ljava/lang/String;[Ls1/n1;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lu2/t0;
    .locals 0

    invoke-static {p0}, Lu2/t0;->d(Landroid/os/Bundle;)Lu2/t0;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Landroid/os/Bundle;)Lu2/t0;
    .locals 3

    sget-object v0, Lu2/t0;->o:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v1, Ls1/n1;->y0:Ls1/h$a;

    invoke-static {v1, v0}, Lp3/c;->b(Ls1/h$a;Ljava/util/List;)Lcom/google/common/collect/q;

    move-result-object v0

    :goto_0
    sget-object v1, Lu2/t0;->p:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Lu2/t0;

    const/4 v2, 0x0

    new-array v2, v2, [Ls1/n1;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls1/n1;

    invoke-direct {v1, p0, v0}, Lu2/t0;-><init>(Ljava/lang/String;[Ls1/n1;)V

    return-object v1
.end method

.method private static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Different "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " combined in one TrackGroup: \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' (track 0) and \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' (track "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const-string p0, "TrackGroup"

    const-string p1, ""

    invoke-static {p0, p1, v0}, Lp3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_0

    const-string v0, "und"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static g(I)I
    .locals 0

    or-int/lit16 p0, p0, 0x4000

    return p0
.end method

.method private h()V
    .locals 6

    iget-object v0, p0, Lu2/t0;->m:[Ls1/n1;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v0, v0, Ls1/n1;->l:Ljava/lang/String;

    invoke-static {v0}, Lu2/t0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lu2/t0;->m:[Ls1/n1;

    aget-object v2, v2, v1

    iget v2, v2, Ls1/n1;->n:I

    invoke-static {v2}, Lu2/t0;->g(I)I

    move-result v2

    const/4 v3, 0x1

    :goto_0
    iget-object v4, p0, Lu2/t0;->m:[Ls1/n1;

    array-length v5, v4

    if-ge v3, v5, :cond_2

    aget-object v4, v4, v3

    iget-object v4, v4, Ls1/n1;->l:Ljava/lang/String;

    invoke-static {v4}, Lu2/t0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v0, p0, Lu2/t0;->m:[Ls1/n1;

    aget-object v1, v0, v1

    iget-object v1, v1, Ls1/n1;->l:Ljava/lang/String;

    aget-object v0, v0, v3

    iget-object v0, v0, Ls1/n1;->l:Ljava/lang/String;

    const-string v2, "languages"

    invoke-static {v2, v1, v0, v3}, Lu2/t0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_0
    iget-object v4, p0, Lu2/t0;->m:[Ls1/n1;

    aget-object v4, v4, v3

    iget v4, v4, Ls1/n1;->n:I

    invoke-static {v4}, Lu2/t0;->g(I)I

    move-result v4

    if-eq v2, v4, :cond_1

    iget-object v0, p0, Lu2/t0;->m:[Ls1/n1;

    aget-object v0, v0, v1

    iget v0, v0, Ls1/n1;->n:I

    invoke-static {v0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lu2/t0;->m:[Ls1/n1;

    aget-object v1, v1, v3

    iget v1, v1, Ls1/n1;->n:I

    invoke-static {v1}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "role flags"

    invoke-static {v2, v0, v1, v3}, Lu2/t0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public b(I)Ls1/n1;
    .locals 1

    iget-object v0, p0, Lu2/t0;->m:[Ls1/n1;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public c(Ls1/n1;)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lu2/t0;->m:[Ls1/n1;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    if-ne p1, v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lu2/t0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lu2/t0;

    iget-object v2, p0, Lu2/t0;->k:Ljava/lang/String;

    iget-object v3, p1, Lu2/t0;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lu2/t0;->m:[Ls1/n1;

    iget-object p1, p1, Lu2/t0;->m:[Ls1/n1;

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

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

.method public hashCode()I
    .locals 2

    iget v0, p0, Lu2/t0;->n:I

    if-nez v0, :cond_0

    const/16 v0, 0x20f

    iget-object v1, p0, Lu2/t0;->k:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu2/t0;->m:[Ls1/n1;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lu2/t0;->n:I

    :cond_0
    iget v0, p0, Lu2/t0;->n:I

    return v0
.end method
