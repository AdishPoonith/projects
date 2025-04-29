.class Ll6/z0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll6/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lm6/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic j:Ll6/z0;


# direct methods
.method private constructor <init>(Ll6/z0;)V
    .locals 0

    iput-object p1, p0, Ll6/z0$b;->j:Ll6/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ll6/z0;Ll6/z0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ll6/z0$b;-><init>(Ll6/z0;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lm6/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll6/z0$b;->j:Ll6/z0;

    invoke-static {v0}, Ll6/z0;->g(Ll6/z0;)Ld6/c;

    move-result-object v0

    invoke-virtual {v0}, Ld6/c;->iterator()Ljava/util/Iterator;

    move-result-object v0

    new-instance v1, Ll6/z0$b$a;

    invoke-direct {v1, p0, v0}, Ll6/z0$b$a;-><init>(Ll6/z0$b;Ljava/util/Iterator;)V

    return-object v1
.end method
