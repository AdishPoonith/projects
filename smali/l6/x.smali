.class public final synthetic Ll6/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/y;


# instance fields
.field public final synthetic a:Ll6/i0;

.field public final synthetic b:Ln6/h;


# direct methods
.method public synthetic constructor <init>(Ll6/i0;Ln6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/x;->a:Ll6/i0;

    iput-object p2, p0, Ll6/x;->b:Ln6/h;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ll6/x;->a:Ll6/i0;

    iget-object v1, p0, Ll6/x;->b:Ln6/h;

    invoke-static {v0, v1}, Ll6/i0;->q(Ll6/i0;Ln6/h;)Ld6/c;

    move-result-object v0

    return-object v0
.end method
