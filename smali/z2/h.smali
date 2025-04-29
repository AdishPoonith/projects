.class public interface abstract Lz2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lz2/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz2/d;

    invoke-direct {v0}, Lz2/d;-><init>()V

    sput-object v0, Lz2/h;->a:Lz2/h;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/net/Uri;Ls1/n1;Ljava/util/List;Lp3/j0;Ljava/util/Map;Lx1/m;Lt1/t1;)Lz2/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ls1/n1;",
            "Ljava/util/List<",
            "Ls1/n1;",
            ">;",
            "Lp3/j0;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lx1/m;",
            "Lt1/t1;",
            ")",
            "Lz2/j;"
        }
    .end annotation
.end method
