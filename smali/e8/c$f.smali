.class Le8/c$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# instance fields
.field public final a:Lr8/c$a;

.field public final b:Le8/c$d;


# direct methods
.method constructor <init>(Lr8/c$a;Le8/c$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/c$f;->a:Lr8/c$a;

    iput-object p2, p0, Le8/c$f;->b:Le8/c$d;

    return-void
.end method
