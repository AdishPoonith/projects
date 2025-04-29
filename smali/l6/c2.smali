.class public final synthetic Ll6/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/d2;

.field public final synthetic b:Lm6/i;


# direct methods
.method public synthetic constructor <init>(Ll6/d2;Lm6/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/c2;->a:Ll6/d2;

    iput-object p2, p0, Ll6/c2;->b:Lm6/i;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ll6/c2;->a:Ll6/d2;

    iget-object v1, p0, Ll6/c2;->b:Lm6/i;

    check-cast p1, Lk6/e;

    invoke-static {v0, v1, p1}, Ll6/d2;->r(Ll6/d2;Lm6/i;Lk6/e;)V

    return-void
.end method
