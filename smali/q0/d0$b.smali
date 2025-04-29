.class public final Lq0/d0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq0/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq0/d0$b$a;
    }
.end annotation


# static fields
.field public static final k:Lq0/d0$b$a;


# instance fields
.field private final j:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lq0/a;",
            "Ljava/util/List<",
            "Lq0/d;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq0/d0$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq0/d0$b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lq0/d0$b;->k:Lq0/d0$b$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Lq0/a;",
            "Ljava/util/List<",
            "Lq0/d;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "proxyEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/d0$b;->j:Ljava/util/HashMap;

    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lq0/d0;

    iget-object v1, p0, Lq0/d0$b;->j:Ljava/util/HashMap;

    invoke-direct {v0, v1}, Lq0/d0;-><init>(Ljava/util/HashMap;)V

    return-object v0
.end method
