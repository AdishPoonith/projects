.class public final synthetic Ll6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/y;


# instance fields
.field public final synthetic a:Ll6/i0;

.field public final synthetic b:Li6/e;


# direct methods
.method public synthetic constructor <init>(Ll6/i0;Li6/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/t;->a:Ll6/i0;

    iput-object p2, p0, Ll6/t;->b:Li6/e;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ll6/t;->a:Ll6/i0;

    iget-object v1, p0, Ll6/t;->b:Li6/e;

    invoke-static {v0, v1}, Ll6/i0;->m(Ll6/i0;Li6/e;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
