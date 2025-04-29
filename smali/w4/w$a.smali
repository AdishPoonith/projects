.class public final Lw4/w$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw4/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:F

.field private b:I

.field private c:I

.field private d:Z

.field private e:Lw4/v;


# direct methods
.method public constructor <init>(Lw4/w;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lw4/w;->D()F

    move-result v0

    iput v0, p0, Lw4/w$a;->a:F

    invoke-virtual {p1}, Lw4/w;->E()Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lw4/w$a;->b:I

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lw4/w$a;->c:I

    invoke-virtual {p1}, Lw4/w;->C()Z

    move-result v0

    iput-boolean v0, p0, Lw4/w$a;->d:Z

    invoke-virtual {p1}, Lw4/w;->B()Lw4/v;

    move-result-object p1

    iput-object p1, p0, Lw4/w$a;->e:Lw4/v;

    return-void
.end method


# virtual methods
.method public a()Lw4/w;
    .locals 7

    new-instance v6, Lw4/w;

    iget v1, p0, Lw4/w$a;->a:F

    iget v2, p0, Lw4/w$a;->b:I

    iget v3, p0, Lw4/w$a;->c:I

    iget-boolean v4, p0, Lw4/w$a;->d:Z

    iget-object v5, p0, Lw4/w$a;->e:Lw4/v;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lw4/w;-><init>(FIIZLw4/v;)V

    return-object v6
.end method

.method public final b(Z)Lw4/w$a;
    .locals 0

    iput-boolean p1, p0, Lw4/w$a;->d:Z

    return-object p0
.end method

.method public final c(F)Lw4/w$a;
    .locals 0

    iput p1, p0, Lw4/w$a;->a:F

    return-object p0
.end method
