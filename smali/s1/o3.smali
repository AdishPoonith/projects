.class public final Ls1/o3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ls1/o3;


# instance fields
.field public final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls1/o3;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls1/o3;-><init>(Z)V

    sput-object v0, Ls1/o3;->b:Ls1/o3;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ls1/o3;->a:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls1/o3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ls1/o3;

    iget-boolean v2, p0, Ls1/o3;->a:Z

    iget-boolean p1, p1, Ls1/o3;->a:Z

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
    .locals 1

    iget-boolean v0, p0, Ls1/o3;->a:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
