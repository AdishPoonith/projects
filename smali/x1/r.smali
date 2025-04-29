.class public interface abstract Lx1/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lx1/p;->b:Lx1/p;

    sput-object v0, Lx1/r;->a:Lx1/r;

    return-void
.end method


# virtual methods
.method public abstract a()[Lx1/l;
.end method

.method public abstract b(Landroid/net/Uri;Ljava/util/Map;)[Lx1/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)[",
            "Lx1/l;"
        }
    .end annotation
.end method
