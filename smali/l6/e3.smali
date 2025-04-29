.class public final synthetic Ll6/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/t;


# instance fields
.field public final synthetic a:Lj6/b1;

.field public final synthetic b:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Lj6/b1;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/e3;->a:Lj6/b1;

    iput-object p2, p0, Ll6/e3;->b:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ll6/e3;->a:Lj6/b1;

    iget-object v1, p0, Ll6/e3;->b:Ljava/util/Set;

    check-cast p1, Lm6/s;

    invoke-static {v0, v1, p1}, Ll6/f3;->i(Lj6/b1;Ljava/util/Set;Lm6/s;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
