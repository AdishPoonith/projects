.class La9/l$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/l$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final b:Lr8/k$d;

.field final c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/String;Lr8/k$d;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/l$a$a;->a:Ljava/lang/String;

    iput-object p2, p0, La9/l$a$a;->b:Lr8/k$d;

    iput-object p3, p0, La9/l$a$a;->c:Ljava/lang/Object;

    return-void
.end method
