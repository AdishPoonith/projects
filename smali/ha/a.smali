.class public Lha/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lea/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lha/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Character;",
        ">;",
        "Lea/a;"
    }
.end annotation


# static fields
.field public static final m:Lha/a$a;


# instance fields
.field private final j:C

.field private final k:C

.field private final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lha/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lha/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lha/a;->m:Lha/a$a;

    return-void
.end method

.method public constructor <init>(CCI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_1

    const/high16 v0, -0x80000000

    if-eq p3, v0, :cond_0

    iput-char p1, p0, Lha/a;->j:C

    invoke-static {p1, p2, p3}, Ly9/c;->b(III)I

    move-result p1

    int-to-char p1, p1

    iput-char p1, p0, Lha/a;->k:C

    iput p3, p0, Lha/a;->l:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be non-zero."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b()C
    .locals 1

    iget-char v0, p0, Lha/a;->j:C

    return v0
.end method

.method public final e()C
    .locals 1

    iget-char v0, p0, Lha/a;->k:C

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lha/a;->k()Lt9/m;

    move-result-object v0

    return-object v0
.end method

.method public k()Lt9/m;
    .locals 4

    new-instance v0, Lha/b;

    iget-char v1, p0, Lha/a;->j:C

    iget-char v2, p0, Lha/a;->k:C

    iget v3, p0, Lha/a;->l:I

    invoke-direct {v0, v1, v2, v3}, Lha/b;-><init>(CCI)V

    return-object v0
.end method
