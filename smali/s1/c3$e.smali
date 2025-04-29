.class public final Ls1/c3$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/c3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final A:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/c3$e;",
            ">;"
        }
    .end annotation
.end field

.field private static final t:Ljava/lang/String;

.field private static final u:Ljava/lang/String;

.field private static final v:Ljava/lang/String;

.field private static final w:Ljava/lang/String;

.field private static final x:Ljava/lang/String;

.field private static final y:Ljava/lang/String;

.field private static final z:Ljava/lang/String;


# instance fields
.field public final j:Ljava/lang/Object;

.field public final k:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final l:I

.field public final m:Ls1/v1;

.field public final n:Ljava/lang/Object;

.field public final o:I

.field public final p:J

.field public final q:J

.field public final r:I

.field public final s:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/c3$e;->t:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/c3$e;->u:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/c3$e;->v:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/c3$e;->w:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/c3$e;->x:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/c3$e;->y:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/c3$e;->z:Ljava/lang/String;

    sget-object v0, Ls1/f3;->a:Ls1/f3;

    sput-object v0, Ls1/c3$e;->A:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILs1/v1;Ljava/lang/Object;IJJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/c3$e;->j:Ljava/lang/Object;

    iput p2, p0, Ls1/c3$e;->k:I

    iput p2, p0, Ls1/c3$e;->l:I

    iput-object p3, p0, Ls1/c3$e;->m:Ls1/v1;

    iput-object p4, p0, Ls1/c3$e;->n:Ljava/lang/Object;

    iput p5, p0, Ls1/c3$e;->o:I

    iput-wide p6, p0, Ls1/c3$e;->p:J

    iput-wide p8, p0, Ls1/c3$e;->q:J

    iput p10, p0, Ls1/c3$e;->r:I

    iput p11, p0, Ls1/c3$e;->s:I

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/c3$e;
    .locals 0

    invoke-static {p0}, Ls1/c3$e;->b(Landroid/os/Bundle;)Ls1/c3$e;

    move-result-object p0

    return-object p0
.end method

.method private static b(Landroid/os/Bundle;)Ls1/c3$e;
    .locals 14

    sget-object v0, Ls1/c3$e;->t:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    sget-object v0, Ls1/c3$e;->u:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v2, Ls1/v1;->x:Ls1/h$a;

    invoke-interface {v2, v0}, Ls1/h$a;->a(Landroid/os/Bundle;)Ls1/h;

    move-result-object v0

    check-cast v0, Ls1/v1;

    :goto_0
    move-object v5, v0

    sget-object v0, Ls1/c3$e;->v:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v7

    sget-object v0, Ls1/c3$e;->w:Ljava/lang/String;

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    sget-object v0, Ls1/c3$e;->x:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    sget-object v0, Ls1/c3$e;->y:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v12

    sget-object v0, Ls1/c3$e;->z:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v13

    new-instance p0, Ls1/c3$e;

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v13}, Ls1/c3$e;-><init>(Ljava/lang/Object;ILs1/v1;Ljava/lang/Object;IJJII)V

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls1/c3$e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ls1/c3$e;

    iget v2, p0, Ls1/c3$e;->l:I

    iget v3, p1, Ls1/c3$e;->l:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ls1/c3$e;->o:I

    iget v3, p1, Ls1/c3$e;->o:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ls1/c3$e;->p:J

    iget-wide v4, p1, Ls1/c3$e;->p:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ls1/c3$e;->q:J

    iget-wide v4, p1, Ls1/c3$e;->q:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget v2, p0, Ls1/c3$e;->r:I

    iget v3, p1, Ls1/c3$e;->r:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ls1/c3$e;->s:I

    iget v3, p1, Ls1/c3$e;->s:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ls1/c3$e;->j:Ljava/lang/Object;

    iget-object v3, p1, Ls1/c3$e;->j:Ljava/lang/Object;

    invoke-static {v2, v3}, Lb5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/c3$e;->n:Ljava/lang/Object;

    iget-object v3, p1, Ls1/c3$e;->n:Ljava/lang/Object;

    invoke-static {v2, v3}, Lb5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls1/c3$e;->m:Ls1/v1;

    iget-object p1, p1, Ls1/c3$e;->m:Ls1/v1;

    invoke-static {v2, p1}, Lb5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Ls1/c3$e;->j:Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Ls1/c3$e;->l:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/c3$e;->m:Ls1/v1;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Ls1/c3$e;->n:Ljava/lang/Object;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget v1, p0, Ls1/c3$e;->o:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-wide v1, p0, Ls1/c3$e;->p:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-wide v1, p0, Ls1/c3$e;->q:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget v1, p0, Ls1/c3$e;->r:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget v1, p0, Ls1/c3$e;->s:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    invoke-static {v0}, Lb5/j;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
